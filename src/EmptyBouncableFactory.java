import java.awt.*;
import java.util.Random;

public class EmptyBouncableFactory implements BouncableFactory{
    private static Random rand = new Random();
    private static final int MAXSIZE = 20;
    private static final int MINSIZE = 10;
    private static final int MAX_CARTESIAN_SPEED = 5;


    @Override
    public Bouncable createCircle(Displayer d) {
        int size = rand.nextInt(MAXSIZE-MINSIZE) + MINSIZE;
        int x = rand.nextInt(d.getWidth()-2*size) + size;
        int y = rand.nextInt(d.getHeight()-2*size) + size;
        int xSpeed = rand.nextInt(MAX_CARTESIAN_SPEED-1)+1;
        int ySpeed = rand.nextInt(MAX_CARTESIAN_SPEED-1)+1;

        return new Circle(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                EmptyRenderer.getInstance()
                );
    }

    @Override
    public Bouncable createRectangle(Displayer d) {
        int size = rand.nextInt(MAXSIZE-MINSIZE) + MINSIZE;
        int x = rand.nextInt(d.getWidth()-2*size) + size;
        int y = rand.nextInt(d.getHeight()-2*size) + size;
        int xSpeed = rand.nextInt(MAX_CARTESIAN_SPEED-1)+1;
        int ySpeed = rand.nextInt(MAX_CARTESIAN_SPEED-1)+1;

        return new Rectangle(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                EmptyRenderer.getInstance()
        );
    }
}
