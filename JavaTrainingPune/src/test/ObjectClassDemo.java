package test;

public class ObjectClassDemo {
    public static void main(String[] args) {
        Employee employee=new Employee(101, "Neha", 150000.00f);
        System.out.println("HashCode of the employee : "+ employee.hashCode());
        System.out.println("\nemployee "+employee);
        System.out.println("\nemployee : " +employee.toString());

        Employee employee2=new Employee(101, "Neha", 150000.00f);
        System.out.println("\nemployee "+employee2);
        System.out.println("\nemployee : " +employee2.toString());
        //System.out.println(employee==employee2);
        System.out.println("\n employee.equals(employee2) :"+employee.equals(employee2));//false
        
        
        
        Employee employee3=employee.clone();
        System.out.println("Clone of employee : employee3 : "+employee3);

    }
}
