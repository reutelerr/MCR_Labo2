package Shapes;

import java.awt.*;
import Display.Render.*;

public interface Bouncable
{
    void draw();
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
