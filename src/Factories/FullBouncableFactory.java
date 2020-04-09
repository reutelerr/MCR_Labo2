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
import Shapes.Circle;
import Shapes.Square;

public class FullBouncableFactory implements BouncableFactory{
    private static final Renderable renderer = FullRenderer.getInstance();

    @Override
    public Circle createCircle() {
        return BouncableFactoryHelper.createCircle(renderer);
    }

    @Override
    public Square createSquare() {
        return BouncableFactoryHelper.createSquare(renderer);
    }


    //Singleton
    private FullBouncableFactory(){

    }

    private static class Instance
    {
        static FullBouncableFactory instance = new FullBouncableFactory();
    }

    /**
     *
     * @return unique instance of this class
     */
    public static FullBouncableFactory getInstance()
    {
        if(Instance.instance == null)
        {
            Instance.instance = new FullBouncableFactory();
        }
        return Instance.instance;
    }

}
