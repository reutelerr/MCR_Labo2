import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Shape2D
{
    Circle(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape2D getShape() {
        return new Circle(pos, speed, size, r);
       // return new Ellipse2D.Double(pos.getX(), pos.getY(), highestX()-pos.getX(), highestY()-pos.getY());
    }
}
