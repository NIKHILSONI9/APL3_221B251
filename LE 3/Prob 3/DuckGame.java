public class DuckGame {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.swim();
        ((Squeakable) rubberDuck).squeak();

        woodenDuck.swim();
        ((MuteQuackable) woodenDuck).mute();

        redHeadDuck.swim();
        ((Flyable) redHeadDuck).fly();
        ((Quackable) redHeadDuck).quack();

        lakeDuck.swim();
        ((Flyable) lakeDuck).fly();
        ((Quackable) lakeDuck).quack();
    }
}
