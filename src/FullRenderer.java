import java.awt.*;

public class FullRenderer implements  Renderable{

    private static class Instance {
        static FullRenderer instance = new FullRenderer();
    }

    @Override
    public void Display(Graphics2D g, Bouncable b) {
        if(b instanceof Circle)
        {
            g.setColor(Color.BLUE);
            //g.fill(b.getShape());
            g.fillOval(((Circle) b).pos.getX(), ((Circle) b).pos.getY(), ((Circle) b).size, ((Circle) b).size);
        }
    }

    public static FullRenderer getInstance()
    {
        return FullRenderer.Instance.instance;
    }
}
