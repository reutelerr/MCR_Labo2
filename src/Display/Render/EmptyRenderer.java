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


    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }


    //Singleton
    private EmptyRenderer(){

    }

    private static class Instance {
        static EmptyRenderer instance = new EmptyRenderer();
    }

    /**
     *
     * @return unique instance of this class
     */
    public static EmptyRenderer getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new EmptyRenderer();
        }
        return Instance.instance;
    }

}
