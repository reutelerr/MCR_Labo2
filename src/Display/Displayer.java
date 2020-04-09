/*
 * Laboratoire : 02
 * Fichier     : Displayer.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Interface à implémenter par le displayer
 */

package Display;

import java.awt.*;
import java.awt.event.KeyAdapter;

//TODO comments
public interface Displayer {
    /**
     * @return Displayer's Width
     */
    int getWidth();

    /**
     * @return Displayer's Height
     */
    int getHeight();

    /**
     * @return Displayer's Graphics
     */
    Graphics2D getGraphics();

    /**
     * repaints the Displayer's content
     */
    void repaint();

    /**
     * sets the Displayer's title
     * @param s the new Title
     */
    void setTitle(String s);

    /**
     * adds a Keyboard Listener
     * @param ka the KeyAdapter to add
     */
    void addKeyListener(KeyAdapter ka);
}
