// Package declaration, helps organize classes
package exception;

import java.io.IOException;

// Class definition
public class ThrowsDemo {

    // Method to perform division, declares that it may throw an ArithmeticException and IOException
    void division(int num1, int num2) throws ArithmeticException, IOException {
        // Attempt to divide num1 by num2 and print the result
        // This may throw ArithmeticException if num2 is zero
    	
    	try {
    	
        System.out.println("Division Result of " + num1 + " and " + num2 + " is : " + (num1 / num2));
    	}
    	catch(ArithmeticException exception)
    	{
    		System.out.println("Exception in the Division method : "+ exception.getMessage());
    	}
        
        // This message will be printed only if no exception occurs
        System.out.println("End of division !!! ");
    }

    // Main method to run the program
    public static void main(String[] args) throws ArithmeticException,IOException {
        // Create an instance of ThrowsDemo
        ThrowsDemo demo = new ThrowsDemo();

        // Try to perform division and handle exceptions
        try {
            // Call the division method with 10 and 0
            demo.division(10, 0);
        } 
        // Catch block for ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        // Catch block for IOException
        catch (IOException e) {
            System.out.println("IO Error occurred: " + e.getMessage());
        }

        // This line will always execute (unless a fatal error happens)
        System.out.println("Program completed.");
    }
}
