package java7features;

import java.util.Scanner;

public class StringToSwitchCase
{
	public static void main(String[] args)
	{
		try (Scanner scanner = new Scanner(System.in))
		{
			System.out.println("Enter Day : ");
			
			String day = scanner.next();
			
			
			switch (day.toLowerCase())
			{
				case "monday":
					System.out.println("Today is Monday");
					break;
				case "tuesday":
					System.out.println("Today is Tuesday");
					break;
				case "wednesday":
					System.out.println("Today is Wednesday");
					break;
				case "thursday":
					System.out.println("Today is Thursday");
					break;
				case "friday":
					System.out.println("Today is Friday");
					break;
				case "saturday":
					System.out.println("Today is Saturday");
					break;
				case "sunday":
					System.out.println("Today is Sunday");
					break;
				default:
					System.out.println(day+" is the Invalid Day ");
			}
		}
	
	}

}
