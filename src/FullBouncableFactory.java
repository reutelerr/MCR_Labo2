public class FullBouncableFactory extends CreatorFactory{
    private static final Renderable renderer = FullRenderer.getInstance();

    public Bouncable createCircle() {
        return super.createCircle(renderer);
    }
    public Bouncable createRectangle() {
        return super.createRectangle(renderer);
    }

}
