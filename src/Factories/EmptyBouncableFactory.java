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
import Shapes.Circle;
import Shapes.Square;

public class EmptyBouncableFactory implements BouncableFactory{
    private static final Renderable renderer = EmptyRenderer.getInstance();

    @Override
    public Circle createCircle() {
        return BouncableFactoryHelper.createCircle(renderer);
    }

    @Override
    public Square createSquare() {
        return BouncableFactoryHelper.createSquare(renderer);
    }


    //Singleton
    private EmptyBouncableFactory(){

    }

    private static class Instance
    {
        static EmptyBouncableFactory instance = new EmptyBouncableFactory();
    }

    /**
     *
     * @return unique instance of this class
     */
    public static EmptyBouncableFactory getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new EmptyBouncableFactory();
        }
        return Instance.instance;
    }

}
