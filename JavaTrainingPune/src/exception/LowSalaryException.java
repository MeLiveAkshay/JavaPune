package exception;  // Declares the package name

// Custom exception class extending the built-in Exception class
public class LowSalaryException extends Exception {

    // Constructor that takes a message and passes it to the parent Exception class
    public LowSalaryException(String msg) {
        super(msg); // Call the superclass (Exception) constructor with the message
    }
}
