package test;

public class ObjectClassDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "Neha", 150000.00f);

        // Displaying the hash code of the employee object
        System.out.println("HashCode of the employee : " + employee.hashCode());

        // Printing the employee object (implicitly calls toString())
        System.out.println("\nemployee " + employee);
        System.out.println("\nemployee : " + employee.toString());

        // Creating another Employee object with same data
        Employee employee2 = new Employee(101, "Neha", 150000.00f);

        // Printing the second employee object
        System.out.println("\nemployee " + employee2);
        System.out.println("\nemployee : " + employee2.toString());

        // Comparing object references (commented out, would return false since different objects)
        // System.out.println(employee == employee2);

        // Comparing object content using equals() (must be overridden in Employee class)
        System.out.println("\n employee.equals(employee2) :" + employee.equals(employee2)); // should be true if equals() is overridden

        // Demonstrating garbage collection reference changes
        Employee employee4 = employee;  // employee4 points to original employee
        employee4 = employee2;          // now employee4 points to employee2
        employee = employee2;           // original employee now also points to employee2

        // Suggesting garbage collection (finalize() will be called if overridden)
        System.gc();

        // Cloning employee object (clone() must be implemented properly in Employee class)
        Employee employee3 = employee.clone();
        System.out.println("Clone of employee : employee3 : " + employee3);
    }
}
