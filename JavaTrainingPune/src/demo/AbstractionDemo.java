package demo;

public abstract class AbstractionDemo {
    
    // Abstract method (no body): must be implemented by subclasses
    abstract void display();

    // Concrete method with implementation
    void show() {
        System.out.println("This is a concrete method: show()");
    }

    // Concrete method with parameter
    void print(String message) {
        System.out.println("This is your Message: " + message);
    }
}
