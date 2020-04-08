/*
 * Laboratoire : 02
 * Fichier     : Square.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Classe représentant un carré
 */

package Shapes;

import Display.Render.Renderable;
import Util.Vector2D;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends Shape2D
{

    /**
     * Constructor
     *
     * @param initPos   position in frame (left-hand corner)
     * @param initSpeed speed
     * @param size      length of sides
     * @param renderer  renderer
     */
    public Square(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape getShape() {
       return new Rectangle2D.Double(lowestX(), lowestY(), highestX()-lowestX(), highestY()-lowestY());
    }
}
