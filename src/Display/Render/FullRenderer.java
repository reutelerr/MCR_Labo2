/*
 * Laboratoire : 02
 * Fichier     : FullRenderer.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Render des formes pleines
 */

package Display.Render;

import Shapes.Bouncable;
import Shapes.Circle;
import Shapes.Square;

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
        }
        else if(b instanceof Square)
        {
            g.setColor(Color.ORANGE);
        }
        g.fill(b.getShape());
    }

    public static FullRenderer getInstance()
    {
        return FullRenderer.Instance.instance;
    }
}
