/*
 * Laboratoire : 02
 * Fichier     : Circle.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Classe représentant un cercle
 */


package Shapes;

import Util.Vector2D;
import Display.Render.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape2D
{
    public Circle(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(lowestX(), lowestY(), highestX()-lowestX(), highestY()-lowestY());
    }
}
