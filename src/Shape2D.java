import java.awt.*;
import java.util.ArrayList;

public abstract class Shape2D implements Bouncable {

    protected Vector2D pos;
    protected Vector2D speed;

    protected Displayer d;
    protected Renderable r;
    protected Color c;
    protected boolean isFull;

    public abstract void draw();

    Shape2D(Vector2D initPos, Vector2D initSpeed, Displayer d, boolean isFull)
    {
        pos = initPos;
        speed = initSpeed;
        this.d = d;
    }

    public abstract Color getColor();

    public void move()
    {
        pos.addVector(speed);

        SingletonFrame frame = SingletonFrame.getInstance();
        if(frame.getHeight() < highestY())
        {
            //pos.addVector(new Vector2D(0, -2*(pos.getY()-frame.getHeight())));
            speed.invertY();
        }
        if(lowestY() < 0)
        {
            //pos.addVector(new Vector2D(0, 2*(0-pos.getY())));
            speed.invertY();
        }

        if(frame.getWidth() < highestX())
        {
            //pos.addVector(new Vector2D(-2*(pos.getX()-frame.getWidth()), 0));
            speed.invertX();
        }
        if(lowestX() < 0)
        {
            //pos.addVector(new Vector2D(2*(0-pos.getX()),0));
            speed.invertX();
        }
    }

    abstract int lowestX();

    abstract int highestX();

    abstract int lowestY();

    abstract int highestY();

    public Renderable getRenderer()
    {
        return r;
    }
}
