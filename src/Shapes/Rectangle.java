package Shapes;

import Util.Vector2D;
import Display.Render.*;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape2D
{

    public Rectangle(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape getShape() {
       return new Rectangle2D.Double(lowestX(), lowestY(), highestX()-lowestX(), highestY()-lowestY());
    }
}
