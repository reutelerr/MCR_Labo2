import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Shape2D
{

    Rectangle(Vector2D initPos, Vector2D initSpeed, int size, Renderable renderer)
    {
        super(initPos, initSpeed, size, renderer);
    }

    @Override
    public Shape2D getShape() {
        return new Rectangle(pos, speed , size, r);
       // return new Rectangle2D.Double(pos.getX(), pos.getY(), highestX()-pos.getX(), highestY()-pos.getY());
    }
}
