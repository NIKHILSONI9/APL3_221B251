abstract class Bharatvanshi {
    boolean kind; // Attribute to track kindness

    // Constructor
    Bharatvanshi(boolean kind) {
        this.kind = kind;
    }

    public abstract void fight(); // Every Bharatvanshi must define this method

    public void obey() {
        System.out.println("Bharatvanshis are generally obedient.");
    }
}
