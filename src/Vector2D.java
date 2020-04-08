public class Vector2D {
    private double[] coords;

    /**
     * @brief Constructor : builds a new geometrical 2-dimensional vector
     * @param x
     * @param y
     */
    Vector2D(double x, double y)
    {
        coords = new double[]{x, y};
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

    public double getX()
    {
        return coords[0];
    }

    public double getY()
    {
        return coords[1];
    }
}
