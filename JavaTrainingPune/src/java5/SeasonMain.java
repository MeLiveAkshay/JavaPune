package java5;

import java.util.Scanner;

public class SeasonMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter the Season : ");
		String input=scanner.next();
		
		Season [] seasons=Season.values();
		boolean status=false;
		for(int i=0;i<seasons.length;i++) {
			Season season=seasons[i];
			
			if(input.equalsIgnoreCase(season.toString())) {
				System.out.println("Valid Season !!!");
				status=true;
				break;
			}
			
		}
		if (status==false)
		{
			System.out.println("Invalid Season !!!");
		}
		
		
	}

}
