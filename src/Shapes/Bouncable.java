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
    void draw();
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
