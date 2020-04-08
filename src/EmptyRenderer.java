import java.awt.*;

public class EmptyRenderer implements  Renderable{
    private static class Instance {
        static EmptyRenderer instance = new EmptyRenderer();
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        if(b instanceof Circle)
        {
            g.setColor(Color.GREEN);
        }
        else if(b instanceof Rectangle)
        {
            g.setColor(Color.RED);
        }
        g.setStroke(new BasicStroke(2));
        g.draw(b.getShape());
    }

    public static EmptyRenderer getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new EmptyRenderer();
        }
        return Instance.instance;
    }
}
