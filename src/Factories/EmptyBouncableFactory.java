package Factories;

import Display.Render.EmptyRenderer;
import Display.Render.Renderable;
import Shapes.Bouncable;

public class EmptyBouncableFactory extends CreatorFactory{
    private static final Renderable renderer = EmptyRenderer.getInstance();

    public Bouncable createCircle() {
        return super.createCircle(renderer);
    }
    public Bouncable createRectangle() {
        return super.createRectangle(renderer);
    }
}
