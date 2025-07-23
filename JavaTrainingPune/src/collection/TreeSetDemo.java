package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo
{
	public static void main(String[] args)
	{
		TreeSet<Student> studentSet = new TreeSet<Student>(new StudentComparator());

        studentSet.add(new Student(102, "Rahul", 85.5f));
        studentSet.add(new Student(101, "Anita", 90.2f));
        studentSet.add(new Student(103, "Suresh", 78.0f));
        studentSet.add(new Student(105, "Neha", 92.1f));
        studentSet.add(new Student(104, "Amit", 80.6f));

        
        /*
        for (Student s : studentSet)
        {
            System.out.println(s);
        }
        */
        
        
        
        System.out.println("_____________________________________________________");
        
        Iterator<Student> iterator=studentSet.iterator();
        System.out.println("1st Student TreeSet Element : ");
        
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		 System.out.println("_____________________________________________________");
		 
		 TreeSet<Student> studentSet4 = new TreeSet<Student>();

	        studentSet4.add(new Student(102, "Rahul", 85.5f));
	        studentSet4.add(new Student(101, "Anita", 90.2f));
	        studentSet4.add(new Student(103, "Suresh", 78.0f));
	        studentSet4.add(new Student(105, "Neha", 92.1f));
	        studentSet4.add(new Student(104, "Amit", 80.6f));

//	        for (Student s : studentSet4)
//	        {
//	            System.out.println(s);
//	        }
//	        
	        
	        
	        System.out.println("_____________________________________________________");
	        
	         iterator=studentSet4.iterator();
	        System.out.println("2nd Student TreeSet Element : ");
	        
			while(iterator.hasNext())
			{
				System.out.println(iterator.next());
			}
	}
}
