package exception;  // Package declaration

// Employee class representing an employee entity
public class Employee {
    // Private fields for encapsulation
    private int id;
    private String name;
    private float salary;

    // Default constructor
    public Employee() {
        // No-argument constructor, can be used to set values later via setters
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

    /**
     * Parameterized Constructor
     * Allows creation of an Employee object with all fields initialized
     * @param id     Employee ID
     * @param name   Employee name
     * @param salary Employee salary
     */
    public Employee(int id, String name, float salary) {
        super();  // Optional, since Object class is the implicit superclass
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
