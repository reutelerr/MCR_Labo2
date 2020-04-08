/*
 * Laboratoire : 02
 * Fichier     : BouncableFactory.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Interface à implémenter par les factory
 */

package Factories;
import Shapes.Bouncable;

public interface BouncableFactory {
    /**
     *
     * @return bouncable circle
     */
    Bouncable createCircle();

    /**
     *
     * @return bouncable square
     */
    Bouncable createSquare();
}
