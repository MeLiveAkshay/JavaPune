package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingDemo {
	public static void main(String[] args) {
		FileOutputStream fileOutputStream=null;
		try {
			fileOutputStream=new FileOutputStream("D:\\Java IDE\\JavaTrainingPune\\src\\File\\message.text",true);
			String msg="Wellcome Every One ";
			fileOutputStream.write(msg.getBytes());
			System.out.println("Writing Message into file");
			
		}
		catch(FileNotFoundException exception)
		{
			exception.printStackTrace();
		} catch (IOException e) {
            e.printStackTrace();
        }
		finally {
			try {
				if(fileOutputStream != null) fileOutputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
