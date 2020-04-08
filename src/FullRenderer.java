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
        else if(b instanceof Rectangle)
        {
            g.setColor(Color.ORANGE);
            //g.draw(b.getShape());
            g.fillRect(((Rectangle) b).pos.getX(), ((Rectangle) b).pos.getY(), ((Rectangle) b).size, ((Rectangle) b).size);
        }
    }

    public static FullRenderer getInstance()
    {
        return FullRenderer.Instance.instance;
    }
}
