import javax.swing.*;
import java.util.Random;

public class BouncableFactoryBase {
    private static Random rand = new Random();
    private static final int MAXSIZE = 20;
    private static final int MINSIZE = 10;
    private static final int MAX_CARTESIAN_SPEED = 3;
    private static final Displayer d = SingletonFrame.getInstance();

    private static int size;
    private static int x;
    private static int y;
    private static double xSpeed;
    private static double ySpeed;

    public static Circle createCircle(Renderable r) {
        generateAttributes();

        return new Circle(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                r
        );
    }

    public static Rectangle createRectangle(Renderable r) {
        generateAttributes();

        return new Rectangle(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                r
        );

    }

    private static void generateAttributes(){
        size = rand.nextInt(MAXSIZE - MINSIZE) + MINSIZE;
        x = rand.nextInt(d.getWidth() - 2*size) + size;
        y = rand.nextInt(d.getHeight() - 2*size) + size;
        xSpeed = rand.nextDouble()*2*MAX_CARTESIAN_SPEED - MAX_CARTESIAN_SPEED;
        ySpeed = rand.nextDouble()*2*MAX_CARTESIAN_SPEED - MAX_CARTESIAN_SPEED;
    }
}
