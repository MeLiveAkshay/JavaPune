package input_output;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterExample {
    public static void main(String[] args) {
    	Scanner scanner=null;
    	FileWriter writer=null;
    	try {
        scanner = new Scanner(System.in);
        System.out.println("Enter the massage : ");
        String msg=scanner.nextLine();
         writer=new FileWriter("D:\\Java IDE\\JavaTrainingPune\\src\\File\\fileWriter.txt",true);
        writer.write("\n"+msg);
        System.out.println("Writing the msg on the file ..........."+msg);
    	}
    	catch(IOException exception) {
    		exception.printStackTrace();
    	}
    	finally {
			try {
				if(writer!=null) {
					writer.close();
				}
				if(scanner !=null) {
					scanner.close();
				}
			}catch(IOException exception) {
				exception.printStackTrace();
			}
		}
    	System.out.println("End of the Application");
    }
}
