// Package declaration to organize the class
package exception;

// Class definition
public class TestThrow {

    // Method to perform division
    void division(int num1, int num2) {
        // Check if denominator is zero
        if (num2 == 0) {
            // Manually throw and catch an ArithmeticException
            try {
                // Throw a new exception with a custom message
                throw new ArithmeticException("Division By Zero not Possible");
            } catch (ArithmeticException exception) {
                // Handle the exception and print the error message
                System.out.println(" " + exception.getMessage());
            }
            // This line still executes after the exception is handled
            System.out.println("hello");
        } else {
            // If denominator is not zero, perform and print division result
            System.out.println("Division Result of " + num1 + " and " + num2 + " is : " + (num1 / num2));
        }

        // This line always executes after division check
        System.out.println("End of division !!! ");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Create an instance of TestThrow
        TestThrow testThrow = new TestThrow();

        // Call the division method with 20 and 0 to trigger exception handling
        testThrow.division(20, 0);

        // Final statement indicating program completion
        System.out.println("Program completed.");
    }
}
