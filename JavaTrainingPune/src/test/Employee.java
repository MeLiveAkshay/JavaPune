package test; // Package declaration - organizes classes into namespaces

// Employee class definition
public class Employee  implements Cloneable{

    // Private fields (data members) - encapsulated using private access modifier
    private int id;           // Employee ID
    private String name;      // Employee Name
    private float salary;     // Employee Salary

    // Default constructor - no parameters, allows object creation without initial values
    public Employee() {
    }

    // Parameterized constructor - used to create an Employee object with specific values
    public Employee(int id, String name, float salary) {
        this.id = id;             // 'this' keyword refers to the current object's field
        this.name = name;
        this.salary = salary;
    }

    // Getter for 'id' - returns the employee's ID
    public int getId() {
        return id;
    }

    // Setter for 'id' - allows changing the employee's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for 'name' - returns the employee's name
    public String getName() {
        return name;
    }

    // Setter for 'name' - allows changing the employee's name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for 'salary' - returns the employee's salary
    public float getSalary() {
        return salary;
    }

    // Setter for 'salary' - allows changing the employee's salary
    public void setSalary(float salary) {
        this.salary = salary;
    }
    @Override
    public int hashCode() {
       
        return id;
    }

    @Override
    public String toString() {
        return "{\n" +
           "  \"id\": " + id + ",\n" +
           "  \"name\": \"" + name + "\",\n" +
           "  \"salary\": " + salary + "\n" +
           "}";
        }


    @Override
    public boolean equals(Object demo) {
        if (demo instanceof Employee) {
            Employee employee=(Employee) demo;//downCasting
            if(this.id == employee.id && this.name.equals(employee.name) && this.salary == employee.salary )
            {
                return true;
            }
           
        }
         return false;
         	
    }
    @Override
    protected Employee clone()
    {
    	return new Employee(this.id,this.name,this.salary);
    }
    
    
    @Override
    protected void finalize()
    {
    	System.out.println("Inside finalize () Method of Employee class !!!");
    }
/*
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee employee=new Employee(101, "Neha", 150000f);
        System.out.println("employee : "+ employee);

        Employee employee2=(Employee) employee.clone();
        System.out.println(employee2);
    }
    */
}
