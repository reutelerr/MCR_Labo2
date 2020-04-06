import java.util.Random;

public class FullBouncableFactory implements BouncableFactory{
    private static Random rand = new Random();

    @Override
    public Bouncable createCircle(Displayer frame) {
        int randomX = rand.nextInt(frame.getWidth()-20);
        int randomY = rand.nextInt(frame.getHeight()-20);

        return new Circle(
                new Vector2D(randomX, randomY),
                new Vector2D(rand.nextInt(4)-2, rand.nextInt(4)-2),
                rand.nextInt(10) + 10,
                frame,
                true
        );
    }
}
