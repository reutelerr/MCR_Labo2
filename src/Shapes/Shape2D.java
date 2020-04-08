/*
 * Laboratoire : 02
 * Fichier     : Shape2D.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Classe abstraite représentant une forme ayant une position, une vitesse et un affichage en 2D
 */

package Shapes;

import Display.Displayer;
import Display.Render.Renderable;
import Display.SingletonFrame;
import Util.Vector2D;

import java.awt.*;

public abstract class Shape2D implements Bouncable {

    private Vector2D pos;
    private Vector2D speed;
    private int size;

    private Displayer d;
    private Renderable r;
    private Color c;


    /**
     * Constructor
     *
     * @param initPos   position in frame (left-hand corner)
     * @param initSpeed speed
     * @param size      length of side
     * @param r         renderer
     */
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

    @Override
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

    @Override
    public Renderable getRenderer()
    {
        return r;
    }

    /**
     *
     * @return lowest position on horizontal axis
     */
    int lowestX()
    {
        return pos.getX();
    }

    /**
     *
     * @return highest position on horizontal axis
     */
    int highestX()
    {
        return pos.getX()+ size;
    }

    /**
     *
     * @return lowest position on vertical axis
     */
    int lowestY()
    {
        return pos.getY();
    }

    /**
     *
     * @return highest position on vertical axis
     */
    int highestY()
    {
        return pos.getY()+ size;
    }

}
