/*
 * Laboratoire : 02
 * Fichier     : EmptyBouncableFactory.java
 * Auteur(s)   : Delhomme Claire, Reuteler Robin
 * Date        : 09.04.2020
 *
 * But         : Factory concrète pour les formes creuses
 */

package Factories;

import Display.Render.EmptyRenderer;
import Display.Render.Renderable;
import Shapes.Bouncable;

public class EmptyBouncableFactory extends CreatorFactory{
    private static final Renderable renderer = EmptyRenderer.getInstance();

    @Override
    public Bouncable createCircle() {
        return super.createCircle(renderer);
    }

    @Override
    public Bouncable createSquare() {
        return super.createSquares(renderer);
    }

    private EmptyBouncableFactory(){

    }

    private static class Instance
    {
        static EmptyBouncableFactory instance = new EmptyBouncableFactory();
    }

    public static EmptyBouncableFactory getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new EmptyBouncableFactory();
        }
        return Instance.instance;
    }

}
