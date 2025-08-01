package java7features;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TryWithResourceDemo
{
	public static void main(String[] args)
	{
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter the message");
			String msg=scanner.nextLine();
			
			try(FileWriter writer=new FileWriter("D:\\Java IDE\\JavaTrainingPune\\src\\java7features\\message.txt"))
			{
				writer.write(msg);
				System.out.println("Writing the file");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}

}
