package Display.Render;

import Shapes.Bouncable;
import Shapes.Circle;
import Shapes.Rectangle;

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
        }
        else if(b instanceof Rectangle)
        {
            g.setColor(Color.RED);
        }
        g.draw(b.getShape());
    }

    public static EmptyRenderer getInstance()
    {
        return Instance.instance;
    }
}
