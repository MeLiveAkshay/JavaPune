package collection;

import java.util.ArrayList;

public class ArrayListDemo
{
   
    public static void main(String[] args)
    {
        // Creating a raw ArrayList (no generics used, allows any type of object)
        @SuppressWarnings("rawtypes")
        ArrayList arrayList = new ArrayList();

        // Adding different types of elements to the list

        arrayList.add(new Integer(10)); // Deprecated way to add Integer, use autoboxing instead
        arrayList.add(20);              // int is auto-boxed to Integer
        arrayList.add(new Float(20.5)); // Deprecated way to add Float, use autoboxing instead
        arrayList.add(16.5);            // double is auto-boxed to Double
        arrayList.add(new String("Hi"));// Explicit String object creation
        arrayList.add("Hello");         // Adding a string literal

        // Inserting an element at a specific index (index 2)
        arrayList.add(2, "Welcome");    // List shifts elements to the right

        arrayList.add(new Integer(10)); // Adding duplicate value (allowed in ArrayList)
        arrayList.add(20.5f);           // float is auto-boxed to Float

        // Printing the full ArrayList
        System.out.println("Array List " + arrayList);

        // Accessing and printing each element using index
        System.out.println("::::::::::::::: ArrayList Elements :::::::::::::::");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }

        // Checking if certain elements exist in the list
        System.out.println("ArrayList Contains 20 : " + arrayList.contains(20));       // true
        System.out.println("ArrayList Contains 'Bye' : " + arrayList.contains("Bye")); // false

        // Getting the index of elements
        System.out.println("Index of 10 : " + arrayList.indexOf(10));            // First occurrence
        System.out.println("Last index of 10 : " + arrayList.lastIndexOf(10));   // Last occurrence
        System.out.println("Index of 50 : " + arrayList.indexOf(50));            // Not found → -1

        // Removing element by index
        System.out.println("Remove Object at Index 2 : " + arrayList.remove(2)); // Removes and returns "Welcome"
        System.out.println(arrayList);                                           // Updated list after removal

        // Removing by object (value)
        System.out.println("Remove Object '20' : " + arrayList.remove(new Integer(20))); // Returns true if successful
        System.out.println("Final ArrayList : " + arrayList);                           // Updated list

        // Printing list elements in a single line
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        // Attempt to remove non-existing element
        System.out.println("Remove 'bye' : " + arrayList.remove("bye")); // Returns false, case-sensitive match fails

       
        
        ArrayList<Employee> employees=new ArrayList<Employee>();
        
        arrayList.add(new Employee(101,"Nisha",150000));
        arrayList.add(new Employee(102,"Amit",159000));
        arrayList.add(new Employee(103,"Suman",180000));
        arrayList.add(new Employee(104,"Sri",250000));
        
        for (int i=0;i<arrayList.size();i++)
        {
        		Object object= arrayList.get(i);
        		
        		
        		if(object instanceof Employee)
        		{
        			Employee employee=(Employee) object;
        			System.out.println("ID : "+employee.getId()+ " Name : "+employee.getName()+" salary : "+employee.getSalary());
        		}
        		else
        		{
        			System.out.println(object);
        		}
        }
        System.out.println("New ArrayList : "+arrayList);
        System.out.println();
        
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        
        arrayList2.add(new Integer(2)); // Old-style boxing (allowed, but deprecated)
        arrayList2.add(20);             // Auto-boxing from int to Integer
        arrayList2.add(30);
        arrayList2.add(40);
        
        // arrayList2.add(56.2); // ❌ Error: Cannot add a double to ArrayList<Integer>. Only Integer values are allowed.

        System.out.println("Integer List: " + arrayList2);
        
        
        
        ArrayList<String> stringList = new ArrayList<String>();

        // Adding String elements
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Mango");

        // stringList.add(100); // ❌ Error: Cannot add an Integer to ArrayList<String>. Only Strings are allowed.

        // Display the contents of the list
        System.out.println("String List: " + stringList);

        // Accessing individual elements
        System.out.println("First element: " + stringList.get(0));
        System.out.println("List size: " + stringList.size());

        // Loop through the list using a for-each loop
        System.out.println("Iterating through the list:");
        for (String item : stringList) {
            System.out.println(item);
        }
    }
}
