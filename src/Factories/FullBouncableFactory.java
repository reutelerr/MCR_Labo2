/*
 * Laboratoire : 02
 * Fichier     : FullBouncableFactory.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Factory concrète pour les formes pleines
 */

package Factories;

import Display.Render.FullRenderer;
import Display.Render.Renderable;
import Shapes.Bouncable;

public class FullBouncableFactory extends CreatorFactory{
    private static final Renderable renderer = FullRenderer.getInstance();

    public Bouncable createCircle() {
        return super.createCircle(renderer);
    }
    public Bouncable createRectangle() {
        return super.createRectangle(renderer);
    }

}
