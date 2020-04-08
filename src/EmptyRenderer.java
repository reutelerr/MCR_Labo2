import java.awt.*;

public class EmptyRenderer implements  Renderable{
    private static class Instance {
        static EmptyRenderer instance = new EmptyRenderer();
    }

    @Override
    public void Display(Graphics2D g, Bouncable b) {
        if(b instanceof Circle)
        {
            g.setColor(Color.BLUE);
            //g.draw(b.getShape());
            g.drawOval(((Circle) b).pos.getX(), ((Circle) b).pos.getY(), ((Circle) b).size, ((Circle) b).size);
        }
    }

    public static EmptyRenderer getInstance()
    {
        return Instance.instance;
    }
}
