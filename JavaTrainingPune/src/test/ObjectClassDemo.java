package test;

public class ObjectClassDemo {
    public static void main(String[] args) {
        Employee employee=new Employee(101, "Neha", 150000.00f);
        System.out.println("HashCode of the employee : "+ employee.hashCode());
        System.out.println("\nemployee : " +employee.toString());

        Employee employee2=new Employee(101, "Neha", 150000.00f);

        System.out.println(employee.equals(employee2));//false

    }
}
