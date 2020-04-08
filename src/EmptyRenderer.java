import java.awt.*;

public class EmptyRenderer implements  Renderable{
    private static class Instance {
        static EmptyRenderer instance = new EmptyRenderer();
    }

    @Override
    public void Display(Graphics2D g, Bouncable b) {
        if(b instanceof Circle)
        {
            g.setColor(Color.GREEN);
            //g.draw(b.getShape());
            g.drawOval(((Circle) b).pos.getX(), ((Circle) b).pos.getY(), ((Circle) b).size, ((Circle) b).size);
        }
        else if(b instanceof Rectangle)
        {
            g.setColor(Color.RED);
            //g.draw(b.getShape());
            g.drawRect(((Rectangle) b).pos.getX(), ((Rectangle) b).pos.getY(), ((Rectangle) b).size, ((Rectangle) b).size);
        }
    }

    public static EmptyRenderer getInstance()
    {
        return Instance.instance;
    }
}
