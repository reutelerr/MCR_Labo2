import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape2D
{
    Circle(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape getShape() {
       return new Ellipse2D.Double(pos.getX(), pos.getY(), highestX()-pos.getX(), highestY()-pos.getY());
    }
}
