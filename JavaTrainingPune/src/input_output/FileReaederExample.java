
package input_output;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class FileReaederExample {
	public static void main(String[] args) {
		File file =new File ("D:\\Java IDE\\JavaTrainingPune\\src\\File\\messsage.txt");
		FileReader fileReader=null;
		BufferedReader bufferedReader=null;
		
		if(file.exists()) {
		try {
		 fileReader=new FileReader(file);
		 bufferedReader=new BufferedReader(fileReader);
		 
		 
		 
		 /*
		  * 
		  * @Read the data character 
		  */
		 /*
		int i=0;
		while((i=fileReader.read())!= -1) {
			System.out.print((char)i);
		}
		*/
		 
		 /*
		  * Read the data line by line
		  */
		 String msg=null;
		 while((msg=bufferedReader.readLine())!=null) {
			 System.out.println(msg);
		 }
		 
		 
		}catch(FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (IOException e) {
						e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fileReader!=null)
				{
					fileReader.close();
				}
				
				if(bufferedReader !=null)
				{
					bufferedReader.close();
				}
			}
			catch (IOException exception) {
				exception.printStackTrace();
			}
				
			
		}
	}
		
		else {
			System.out.println("File Does Not Exists.");
		}
		System.out.println("End of the Application");
	}
}
