class ConcreteTest extends AbsTest {
    @Override
    public void display() {
        System.out.println("ConcreteTest class implementing display().");
    }

    public static void main(String[] args) {
        ConcreteTest obj = new ConcreteTest();
        obj.display();
    }
}
