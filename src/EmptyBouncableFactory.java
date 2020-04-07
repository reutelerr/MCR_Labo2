import java.awt.*;
import java.util.Random;

public class EmptyBouncableFactory implements BouncableFactory{
    private static Random rand = new Random();

    @Override
    public Bouncable createCircle(Displayer d) {
        int randomX = rand.nextInt(d.getWidth()-20);
        int randomY = rand.nextInt(d.getHeight()-20);

        return new Circle(
                new Vector2D(randomX, randomY),
                new Vector2D(rand.nextInt(4)-2, rand.nextInt(4)-2),
                rand.nextInt(10) + 10,
                d,
                false
                );
    }
}
