import javax.swing.*;
import java.util.Random;

public class BouncableFactoryBase {
    private static Random rand = new Random();
    private static final int MAXSIZE = 20;
    private static final int MINSIZE = 10;
    private static final int MAX_CARTESIAN_SPEED = 3;
    private static final Displayer d = SingletonFrame.getInstance();


    public static Circle createCircle(Renderable r) {
        int[] attributes = generateAttributes();

        return new Circle(
                new Vector2D(attributes[0], attributes[1]),
                new Vector2D(attributes[2], attributes[3]),
                attributes[4],
                r
        );
    }

    public static Rectangle createRectangle(Renderable r) {
        int[] attributes = generateAttributes();

        return new Rectangle(
                new Vector2D(attributes[0], attributes[1]),
                new Vector2D(attributes[2], attributes[3]),
                attributes[4],
                r
        );

    }

    private static int[] generateAttributes(){
        int size = rand.nextInt(MAXSIZE - MINSIZE) + MINSIZE;
        int x = rand.nextInt(d.getWidth() - 2 * size) + size;
        int y = rand.nextInt(d.getHeight() - 2 * size) + size;
        int xSpeed = rand.nextInt(MAX_CARTESIAN_SPEED - 1) + 1;
        int ySpeed = rand.nextInt(MAX_CARTESIAN_SPEED - 1) + 1;
        return new int[] {x, y , xSpeed, ySpeed, size};
    }
}
