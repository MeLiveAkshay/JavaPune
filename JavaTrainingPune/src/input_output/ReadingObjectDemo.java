package input_output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class ReadingObjectDemo {
	
	public static void main(String[] args) {
		FileInputStream fileInputStream=null;
		ObjectInputStream inputStream=null;
		try {
			 fileInputStream=new FileInputStream("D:\\Java IDE\\JavaTrainingPune\\src\\File\\product.txt");
			 inputStream=new ObjectInputStream(fileInputStream);
			 
			 Product product =(Product) inputStream.readObject();
			 System.out.println("Product Details : ");
			 System.out.println("ID :" +product.getID());
			 System.out.println("Name :" +product.getName());
			 System.out.println("Price :" +product.getPrice());
			 System.out.println("Category :" +product.getCategory());
			 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException exception) {
			exception.printStackTrace();
		}
		catch(ClassNotFoundException classNotFoundException) {
			classNotFoundException.printStackTrace();
		}
		
		finally {
			try {
				if(inputStream!=null) inputStream.close();
			}catch(IOException exception) {
				exception.printStackTrace();
			}
		}
	}

}
