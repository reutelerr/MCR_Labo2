import javax.swing.*;

public interface BouncableFactory {
    Bouncable createCircle(Renderable d);
    Bouncable createRectangle(Renderable d);
}
