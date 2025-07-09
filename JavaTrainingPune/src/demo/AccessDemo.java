package demo;

public class AccessDemo {
    private String msg;  // private variable, accessible only within this class

    // Protected method, accessible within the package and subclasses
    protected void show() {
        System.out.println("Show() with protected access");
        System.out.println("Message is: " + msg);
    }

    public static void main(String[] args) {
        AccessDemo accessDemo = new AccessDemo();
        accessDemo.msg = "Hello";  // Accessing private variable within the same class is allowed
        accessDemo.show();          // Calling protected method within the same class
    }
}
