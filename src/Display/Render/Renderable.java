package Display.Render;

import Shapes.Bouncable;

import java.awt.*;

public interface Renderable {
    void Display(Graphics2D g, Bouncable b);
}
