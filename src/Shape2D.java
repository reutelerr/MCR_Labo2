import java.awt.*;

public abstract class Shape2D implements Bouncable {

    protected Vector2D pos;
    protected Vector2D speed;
    protected int size;

    protected Displayer d;
    protected Renderable r;
    protected Color c;



    Shape2D(Vector2D initPos, Vector2D initSpeed, int size, Renderable r)
    {
        pos = initPos;
        speed = initSpeed;
        this.r = r;
        this.size = size;

        d = SingletonFrame.getInstance();
    }

    @Override
    public void draw()
    {
        r.Display(d.getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return c;
    }

    public void move()
    {
        pos.addVector(speed);

        if(d.getHeight() < highestY())
        {
            speed.invertY();
        }
        if(lowestY() < 0)
        {
            speed.invertY();
        }

        if(d.getWidth() < highestX())
        {
            speed.invertX();
        }
        if(lowestX() < 0)
        {
            speed.invertX();
        }
    }

    int lowestX()
    {
        return pos.getX();
    }

    int highestX()
    {
        return pos.getX()+ size;
    }

    int lowestY()
    {
        return pos.getY();
    }

    int highestY()
    {
        return pos.getY()+ size;
    }

    public Renderable getRenderer()
    {
        return r;
    }
}
