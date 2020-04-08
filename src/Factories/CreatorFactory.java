/*
 * Laboratoire : 02
 * Fichier     : CreatorFactory.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Factory abstraite
 */

package Factories;

import Display.Displayer;
import Display.Render.Renderable;
import Display.SingletonFrame;
import Shapes.Bouncable;
import Shapes.Circle;
import Shapes.Square;
import Util.Vector2D;

import java.util.Random;

abstract public class CreatorFactory implements BouncableFactory {
    private static Random rand = new Random();
    private static final int MAXSIZE = 20;
    private static final int MINSIZE = 10;
    private static final int MAX_CARTESIAN_SPEED = 3;
    private static final Displayer d = SingletonFrame.getInstance();

    //Méthodes à redéfinir dans les classes concrètes
    abstract public Bouncable createSquare();
    abstract public Bouncable createCircle();


    /**
     * Concrete factories call this method to create circles
     *
     * @param r Renderer
     * @return  bouncable circle
     */
    Bouncable createCircle(Renderable r) {
        int[] attributes = generateAttributes();

        return new Circle(
                new Vector2D(attributes[0], attributes[1]),
                new Vector2D(attributes[2], attributes[3]),
                attributes[4],
                r
        );
    }


    /**
     * Concrete factories call this method to create squares
     *
     * @param r Renderer
     * @return  bouncable square
     */
    Bouncable createSquares(Renderable r) {
        int[] attributes = generateAttributes();

        return new Square(
                new Vector2D(attributes[0], attributes[1]),
                new Vector2D(attributes[2], attributes[3]),
                attributes[4],
                r
        );

    }

    /**
     * Generates random attributes for shape creation
     *
     * @return attributes as an array
     */
    private int[] generateAttributes(){
        int size = rand.nextInt(MAXSIZE - MINSIZE) + MINSIZE;
        int x = rand.nextInt(d.getWidth() - 2 * size) + size;
        int y = rand.nextInt(d.getHeight() - 2 * size) + size;
        int xSpeed = rand.nextInt(MAX_CARTESIAN_SPEED - 1) + 1;
        int ySpeed = rand.nextInt(MAX_CARTESIAN_SPEED - 1) + 1;
        return new int[] {x, y , xSpeed, ySpeed, size};
    }
}
