package collection;

import java.util.ArrayList;

public class ArrayListDemo
{
    // Suppress warnings for using raw types and deprecated constructors (e.g., new Integer())
    @SuppressWarnings({ "unchecked", "removal" })
    public static void main(String[] args)
    {
        // Creating a raw ArrayList (no generic type defined, allows any type of object)
        @SuppressWarnings("rawtypes")
        ArrayList arrayList = new ArrayList();

        // Adding an Integer object explicitly (old style; deprecated)
        arrayList.add(new Integer(10));  // Use of 'new Integer()' is discouraged

        // Adding a primitive int — gets auto-boxed to Integer
        arrayList.add(20);  // Java auto-boxes int to Integer

        // Adding a Float object explicitly (deprecated)
        arrayList.add(new Float(20.5));  // Old way; use Float.valueOf() or autoboxing

        // Adding a double literal — gets auto-boxed to Double
        arrayList.add(16.5);  // Auto-boxed: double → Double

        // Adding a String using constructor (redundant, but valid)
        arrayList.add(new String("Hi"));  // Explicit String object creation

        // Adding a string literal directly
        arrayList.add("Hello");  // Common, simple usage

        // Inserting an element at index 2
        arrayList.add(2, "Welcome");  // Inserts "Welcome" at index 2 (0-based index)

        // Print the entire list
        System.out.println("Array List " + arrayList);
        
        // Accessing each element using get(index)
        System.out.println("::::::::::::::: ArrayList Elements :::::::::::::::");
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }
}
