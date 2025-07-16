package input_output;  // Declares the package

// Import required I/O classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {

        // Create a File object pointing to the target file path
        File file = new File("D:\\Java IDE\\JavaTrainingPune\\src\\File\\demo.text");

        // Check if the file exists before trying to read it
        if (file.exists()) {
            System.out.println("It Exists");
            FileInputStream fileInputStream=null;
            // Try-catch block only for file reading logic
            try {
                // Create a FileInputStream to read the file content as bytes
                 fileInputStream = new FileInputStream(file);

                int i = 0; // Variable to hold each byte read

                // Loop to read each byte from the file until end-of-file (-1)
                while ((i = fileInputStream.read()) != -1) {
                    System.out.print((char) i); // Convert byte to character and print
                }

                // Note: You should always close resources
                fileInputStream.close(); // Close the stream to release system resources

            } catch (FileNotFoundException exception) {
                // Handles case where file is somehow not found (unlikely here since we checked)
                exception.printStackTrace(); // Prints detailed exception info
            } catch (IOException exception) {
                // Handles input/output errors during reading
                exception.printStackTrace();
            }
            finally
            {
				try 
				{
					if(fileInputStream !=null) fileInputStream.close();
				}
					
				catch(IOException ioException)
				{
					ioException.printStackTrace();
				}
			}

        } else {
            // If the file does not exist, print an error message
            System.err.println("File Does Not Exist!!!");
        }
    }
}
