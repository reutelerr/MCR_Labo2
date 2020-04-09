/*
 * Laboratoire : 02
 * Fichier     : Vector2D.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Utilitaire pour la représentation de coordonnées ou de vitesses en 2D
 */


package Util;

public class Vector2D {
    private double[] coords;

    /**
     * Constructor
     *
     * @param x value for X-axis
     * @param y value for Y-axis
     */
    public Vector2D(double x, double y)
    {
        coords = new double[]{x, y};
    }

    /**
     * Adds other vector to this
     *
     * @param v other vector
     */
    public void addVector(Vector2D v)
    {
        this.coords[0]+=v.coords[0];
        this.coords[1]+=v.coords[1];
    }

    /**
     * Negates X-axis value
     */
    public void invertX()
    {
        this.coords[0] = -this.coords[0];
    }

    /**
     * Negates Y-axis value
     */
    public void invertY()
    {
        this.coords[1] = -this.coords[1];
    }


    /**
     *
     * @return X-axis value
     */
    public double getX()
    {
        return coords[0];
    }

    /**
     *
     * @return Y-axis value
     */
    public double getY()
    {
        return coords[1];
    }
}
