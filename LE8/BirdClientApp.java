public class BirdClientApp {
    public static void main(String[] args) {
        BlackBird localBird = new IndianBlackBird();
        WhiteSwan adaptedBird = new BirdAdapter(localBird);
        interactWithBird(adaptedBird);
    }

    public static void interactWithBird(WhiteSwan bird) {
        bird.vocalize();
        bird.floatOnWater();
        bird.feed();
    }
}
