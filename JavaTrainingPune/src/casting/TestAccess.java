package casting;

import demo.AccessDemo;

public class TestAccess extends AccessDemo {
    public static void main(String[] args) {
        // Upcasting: reference type is parent class, object is subclass
        AccessDemo accessDemo = new TestAccess();

        // accessDemo.msg = "Hello"; 
        // ❌ Cannot access 'msg' because it's private in AccessDemo
        // Private members are NOT accessible even in subclasses or other packages.

        // Downcasting: cast parent reference back to subclass to access subclass-specific methods or override methods
        ((TestAccess) accessDemo).show();  
        // Here, 'show()' is protected, accessible in subclass, so this works.

        // Direct instance of subclass calling protected method
        TestAccess access = new TestAccess();
        access.show();
    }
}
