package demo;

public class AbstractionTest extends AbstractionDemo {

    // Implementing the abstract method
    @Override
    void display() {
        System.out.println("display() method implemented in AbstractionTest class.");
    }

    // Main method to test
    public static void main(String[] args) {
        AbstractionTest obj = new AbstractionTest(); // Create object

        obj.display();             // Call overridden method
        obj.show();                // Call inherited concrete method
        obj.print("Hello World");  // Call concrete method with argument
    }
}
