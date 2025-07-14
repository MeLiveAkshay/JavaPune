// Define the package name (this should match your folder structure)
package exception;

public class DivisionDemo {
    public static void main(String[] args) {
        try {
            // Try to parse the first command line argument to an integer
            int num1 = Integer.parseInt(args[0]);
            System.out.println("First Number is : " + num1);
            
            // Try to parse the second command line argument to an integer
            int num2 = Integer.parseInt(args[1]);
            System.out.println("Second Number is : " + num2);	
            
            try {
				// Perform division and display the result
				System.out.println("Division Result of " + num1 + " and " + num2 + " is : " + (num1 / num2));
			} catch (ArrayIndexOutOfBoundsException e) {
				// TODO Auto-generated catch block
				
				System.out.println("Exception in the Application : "+e.getMessage());
			}
            finally {
				System.out.println("Inner Finally Block");
			}
            System.out.println("Hello");
        } 
        // This block handles the case where inputs are not valid integers
        catch (NumberFormatException exception) {
            System.out.println("Please pass proper Numeric Value !!! " + exception.getMessage());
        } 
        // This block handles the case where fewer than two arguments are passed
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Pass 2 command line arguments !!! " + exception.getMessage());
        } 
        // This block handles division by zero errors
        catch (ArithmeticException exception) {
            System.out.println("Division by zero NOT Possible !!! " + exception.getMessage());
        }
        
        finally {
			System.out.println("Finally Block Executes Alaways");
		}
        // This statement runs regardless of whether an exception occurs or not
        System.out.println("End of the application");
    }
}
