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
    private int[] coords;

    /**
     * @brief Constructor : builds a new geometrical 2-dimensional vector
     * @param x
     * @param y
     */
    public Vector2D(int x, int y)
    {
        coords = new int[]{x, y};
    }

    public void addVector(Vector2D v)
    {
        this.coords[0]+=v.coords[0];
        this.coords[1]+=v.coords[1];
    }

    public void invertX()
    {
        this.coords[0] = -this.coords[0];
    }

    public void invertY()
    {
        this.coords[1] = -this.coords[1];
    }

    public void invert()
    {
        this.invertX();
        this.invertY();
    }

    public int getX()
    {
        return coords[0];
    }

    public int getY()
    {
        return coords[1];
    }
}
