/*
 * Laboratoire : 02
 * Fichier     : EmptyRenderer.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Render des formes creuses
 */

package Display.Render;

import Shapes.Bouncable;
import Shapes.Circle;
import Shapes.Square;

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
        else if(b instanceof Square)
        {
            g.setColor(Color.RED);
        }
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

    private EmptyRenderer(){

    }
}
