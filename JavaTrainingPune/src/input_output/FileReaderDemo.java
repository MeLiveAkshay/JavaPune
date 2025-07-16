package input_output;  // Declares the package name

// Import required I/O classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * This program demonstrates reading data from a file using FileInputStream.
 * - It checks for the existence of the file before attempting to read.
 * - It reads the file byte-by-byte and prints each character to the console.
 * - Proper exception handling and resource management (finally block) are used.
 */
public class FileReaderDemo {
    public static void main(String[] args) {

        // Create a File object with the full path of the file to read
        File file = new File("D:\\Java IDE\\JavaTrainingPune\\src\\File\\demo.text");

        // Check if the file actually exists
        if (file.exists()) {
            System.out.println("It Exists");

            FileInputStream fileInputStream = null;  // Declare stream variable

            try {
                // Initialize FileInputStream to read file as bytes
                fileInputStream = new FileInputStream(file);

                int i = 0; // Variable to store byte read from the file

                // Read the file byte by byte until end of file (-1)
                while ((i = fileInputStream.read()) != -1) {
                    System.out.print((char) i); // Convert byte to character and print
                }

                // Close the stream (though also handled in finally block)
                fileInputStream.close();

            } catch (FileNotFoundException exception) {
                // Handles case where file is not found (e.g., deleted after the exists() check)
                exception.printStackTrace();

            } catch (IOException exception) {
                // Handles general I/O errors during reading
                exception.printStackTrace();

            } finally {
                // Ensure the stream is closed to prevent resource leak
                try {
                    if (fileInputStream != null) fileInputStream.close();
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }

        } else {
            // Message if the file does not exist at the given path
            System.err.println("File Does Not Exist!!!");
        }
    }
}
