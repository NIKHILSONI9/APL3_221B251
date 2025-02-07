class Test implements Testable {
    @Override
    public void display() { // Must be public to properly override the interface method
        System.out.println("Test class implementing Testable interface.");
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
    }
}
