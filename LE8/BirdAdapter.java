public class BirdAdapter implements WhiteSwan {
    private BlackBird blackBird;

    public BirdAdapter(BlackBird blackBird) {
        this.blackBird = blackBird;
    }

    @Override
    public void vocalize() {
        blackBird.scream();
    }

    @Override
    public void floatOnWater() {
        blackBird.glide();
    }

    @Override
    public void feed() {
        blackBird.munch();
    }
}
