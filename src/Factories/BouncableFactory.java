package Factories;

import Display.Render.Renderable;
import Shapes.Bouncable;

public interface BouncableFactory {
    Bouncable createCircle(Renderable d);
    Bouncable createRectangle(Renderable d);
}
