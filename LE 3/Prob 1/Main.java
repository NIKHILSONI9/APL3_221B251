public class Main {
    public static void main(String[] args) {
        Bharatvanshi arjun = new Arjun();
        Bharatvanshi bheem = new Bheem();
        Bharatvanshi duryodhan = new Duryodhan();
        Bharatvanshi vikarn = new Vikarn();

        System.out.println("=== Arjun ===");
        arjun.fight();
        arjun.obey();
        System.out.println("Kind: " + arjun.kind);

        System.out.println("\n=== Bheem ===");
        bheem.fight();
        bheem.obey();
        System.out.println("Kind: " + bheem.kind);

        System.out.println("\n=== Duryodhan ===");
        duryodhan.fight();
        duryodhan.obey();
        System.out.println("Kind: " + duryodhan.kind);

        System.out.println("\n=== Vikarn ===");
        vikarn.fight();
        vikarn.obey();
        System.out.println("Kind: " + vikarn.kind);
    }
}
