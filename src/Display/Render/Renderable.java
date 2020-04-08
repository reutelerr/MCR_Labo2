/*
 * Laboratoire : 02
 * Fichier     : Renderable.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Interface à implémenter par les renderer
 */

package Display.Render;

import Shapes.Bouncable;

import java.awt.*;

public interface Renderable {
    void Display(Graphics2D g, Bouncable b);
}
