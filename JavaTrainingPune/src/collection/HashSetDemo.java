package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
	public static void main(String[] args)
	{
		HashSet<Integer> set =new HashSet<Integer>();
		set.add(10);//auto -boxing
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		
		Iterator<Integer> iterator = set.iterator();
		while (iterator.hasNext())
		{
		    System.out.println(iterator.next());
		}
		
		HashSet<String> set2=new HashSet<String>();
		set2.add("Hello");
		set2.add("Hey");
		set2.add("Hello");
		set2.add("hey");
		set2.add("bye");
		set2.add("hey");
		set2.add("bye");
		set2.add("Hello");
		set2.add("Hello");
		
		System.out.println(" Value of the set 2 : "+set2);
	}
}
