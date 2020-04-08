public class EmptyBouncableFactory extends CreatorFactory{
    private static final Renderable renderer = EmptyRenderer.getInstance();

    public Bouncable createCircle() {
        return super.createCircle(renderer);
    }
    public Bouncable createRectangle() {
        return super.createRectangle(renderer);
    }
}
