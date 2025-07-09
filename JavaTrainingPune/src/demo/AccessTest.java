package demo;

public class AccessTest {
    public static void main(String[] args) {
        AccessDemo accessDemo = new AccessDemo();
        accessDemo.msg = "Hello";  // Accessing private variable within the same class is allowed
        accessDemo.show();          // Calling protected method within the same class
    }
}
