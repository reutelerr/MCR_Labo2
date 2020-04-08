import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

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
        r.display(d.getGraphics(), this);
    }

    @Override
    public Color getColor() {
        return c;
    }

    public void move()
    {
        pos.addVector(speed);

        SingletonFrame frame = SingletonFrame.getInstance();
        if(d.getHeight() < highestY())
        {
            //pos.addVector(new Vector2D(0, -2*(pos.getY()-frame.getHeight())));
            speed.invertY();
        }
        if(lowestY() < 0)
        {
            //pos.addVector(new Vector2D(0, 2*(0-pos.getY())));
            speed.invertY();
        }

        if(d.getWidth() < highestX())
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

    double lowestX()
    {
        return pos.getX();
    }

    double highestX()
    {
        return pos.getX()+ size;
    }

    double lowestY()
    {
        return pos.getY();
    }

    double highestY()
    {
        return pos.getY()+ size;
    }

    public Renderable getRenderer()
    {
        return r;
    }
}
