package Factories;

import Display.*;
import Display.Render.Renderable;
import Shapes.*;
        import Util.Vector2D;
        import java.util.Random;

public class BouncableFactoryHelper {
    private static Random rand = new Random();
    private static final int MAXSIZE = 20;
    private static final int MINSIZE = 10;
    private static final int MAX_CARTESIAN_SPEED = 3;
    private static Displayer d = SingletonFrame.getInstance();

    private static int size;
    private static int x;
    private static int y;
    private static double xSpeed;
    private static double ySpeed;

    /**
     * Creates a Circle by generating random attributes, and giving it a renderer
     * @param r The shape's renderer i.e. its appearance
     * @return A new Circle
     */
    public static Circle createCircle(Renderable r) {
        generateAttributes();

        return new Circle(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                r
        );
    }

    /**
     * Creates a Square by generating random attributes, and giving it a renderer
     * @param r The shape's renderer i.e. its appearance
     * @return A new Square
     */
    public static Square createSquare(Renderable r) {
        generateAttributes();

        return new Square(
                new Vector2D(x, y),
                new Vector2D(xSpeed, ySpeed),
                size,
                r
        );

    }

    /**
     * Sets attributes for the next Bouncable
     */
    private static void generateAttributes(){
        size = rand.nextInt(MAXSIZE - MINSIZE) + MINSIZE;
        x = rand.nextInt(d.getWidth() - 2*size) + size;
        y = rand.nextInt(d.getHeight() - 2*size) + size;
        xSpeed = rand.nextDouble()*2*MAX_CARTESIAN_SPEED - MAX_CARTESIAN_SPEED;
        ySpeed = rand.nextDouble()*2*MAX_CARTESIAN_SPEED - MAX_CARTESIAN_SPEED;
    }
}
