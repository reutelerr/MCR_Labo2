import javax.swing.*;
import java.awt.*;

public class Circle extends Shape2D
{
    int radius;

    Circle(Vector2D initPos, Vector2D initSpeed, int r, Displayer d, boolean isFull)
    {
        super(initPos, initSpeed, d, isFull);
        radius = r;
        c = Color.BLUE;
    }

    public void draw()
    {
        Graphics2D g = d.getGraphics();
        g.setColor(c);
        g.fillOval(pos.getX(), pos.getY(), 2*radius, 2*radius);
    }

    @Override
    public Shape getShape() {
        return null;
    }

    @Override
    public Color getColor() {
        return c;
    }

    int lowestX()
    {
        return pos.getX();
    }

    int highestX()
    {
        return pos.getX()+2*radius;
    }

    int lowestY()
    {
        return pos.getY();
    }

    int highestY()
    {
        return pos.getY()+2*radius;
    }
}
