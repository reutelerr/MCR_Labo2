/*
 * Laboratoire : 02
 * Fichier     : Bouncable.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Interface à implémenter par les bouncers
 */


package Shapes;

import java.awt.*;
import Display.Render.*;

public interface Bouncable
{
    /**
     *  Handles shape display by calling renderer method
     */
    void draw();

    /**
     *  Handles shape movement
     */
    void move();

    /**
     *
     * @return renderer
     */
    Renderable getRenderer();

    /**
     *
     * @return color
     */
    Color getColor();

    /**
     *
     * @return shape
     */
    Shape getShape();
}
