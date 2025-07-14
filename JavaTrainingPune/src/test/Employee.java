package test; // Package declaration - organizes classes into namespaces

import java.util.Objects;

// Employee class definition
public class Employee implements Cloneable {

    // Private fields (data members) - encapsulated using private access modifier
    private int id;           // Employee ID
    private String name;      // Employee Name
    private float salary;     // Employee Salary

    // Default constructor - no parameters, allows object creation without initial values
    public Employee() {
    }

    // Parameterized constructor - used to create an Employee object with specific values
    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter for 'id'
    public int getId() {
        return id;
    }

    // Setter for 'id'
    public void setId(int id) {
        this.id = id;
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'salary'
    public float getSalary() {
        return salary;
    }

    // Setter for 'salary'
    public void setSalary(float salary) {
        this.salary = salary;
    }

    // Override toString() to display employee details in JSON-like format
    @Override
    public String toString() {
        return "{\n" +
                "  \"id\": " + id + ",\n" +
                "  \"name\": \"" + name + "\",\n" +
                "  \"salary\": " + salary + "\n" +
                "}";
    }

    // Override clone() method to support cloning Employee objects
    @Override
    public Employee clone() {
        return new Employee(this.id, this.name, this.salary);
    }

    // Override hashCode() for hash-based collections
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    // Override equals() for logical comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employee)) return false;
        Employee other = (Employee) obj;
        return id == other.id &&
               Objects.equals(name, other.name) &&
               Float.floatToIntBits(salary) == Float.floatToIntBits(other.salary);
    }

    /*
    // Main method for testing
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Neha", 150000f);
        System.out.println("Original Employee:");
        System.out.println(employee1);

        // Clone the employee
        Employee employee2 = employee1.clone();
        System.out.println("\nCloned Employee:");
        System.out.println(employee2);

        // Equality check
        System.out.println("\nAre both employees equal? " + employee1.equals(employee2));

        // Change something in the clone
        employee2.setName("Rohit");
        System.out.println("\nModified Cloned Employee:");
        System.out.println(employee2);

        System.out.println("\nOriginal Employee After Modification (Should remain unchanged):");
        System.out.println(employee1);
    }
    */
}
