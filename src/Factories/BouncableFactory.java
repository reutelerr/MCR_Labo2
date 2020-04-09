/*
 * Laboratoire : 02
 * Fichier     : BouncableFactory.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Interface à implémenter par les factory
 */

package Factories;
import Shapes.*;

public interface BouncableFactory {
    /**
     *
     * @return bouncable circle
     */
    Circle createCircle();

    /**
     *
     * @return bouncable square
     */
    Square createSquare();
}
