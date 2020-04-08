import java.awt.*;

public class FullRenderer implements  Renderable{

    private static class Instance {
        static FullRenderer instance = new FullRenderer();
    }

    @Override
    public void display(Graphics2D g, Bouncable b) {
        if(b instanceof Circle)
        {
            g.setColor(Color.BLUE);
        }
        else if(b instanceof Rectangle)
        {
            g.setColor(Color.ORANGE);
        }
        g.fill(b.getShape());
    }

    public static FullRenderer getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new FullRenderer();
        }
        return FullRenderer.Instance.instance;
    }
}
