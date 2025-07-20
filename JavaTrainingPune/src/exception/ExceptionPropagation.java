package exception;

public class ExceptionPropagation {
	void method3() {
        int result = 5 / 0;  // ArithmeticException occurs
    }

    void method2() {
        method3();           // No try-catch here
    }

    void method1() {
        try {
            method2();       // Try-catch here
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in method1: " + e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.method1();
    }
}
