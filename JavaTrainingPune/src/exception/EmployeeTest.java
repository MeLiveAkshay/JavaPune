package exception;  // Declares that this class belongs to the 'exception' package

public class EmployeeTest {
    public static void main(String[] args) {
        // Parse command-line arguments for id, name, and salary
        int id = Integer.parseInt(args[0]);       // Convert first argument to integer (Employee ID)
        String name = args[1];                    // Second argument as String (Employee name)
        float salary = Float.parseFloat(args[2]); // Convert third argument to float (Employee salary)

        // Check if salary is less than 100000
        if (salary < 100000) {
            try {
                // If salary is low, throw a custom exception
                throw new LowSalaryException("Salary is too low");
            } catch (LowSalaryException exception) {
                // Handle the custom exception and print stack trace
                exception.printStackTrace(); // Display where the exception occurred
                System.err.println("Exception is : " + exception.getMessage()); // Print exception message
            }
        } else {
            // If salary is valid, create and display Employee object
            Employee employee = new Employee(id, name, salary); // Instantiate Employee with given details

            System.out.println("/n Employee Details: "); // Minor typo: "/n" should be "\n" for newline
            System.out.println("Id : " + employee.getId());         // Print Employee ID
            System.out.println("Name : " + employee.getName());     // Print Employee name
            System.out.println("Salary : " + employee.getSalary()); // Print Employee salary
        }

        // End of application message
        System.out.println("End of the Application ");
    }
}
