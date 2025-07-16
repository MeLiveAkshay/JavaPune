package input_output;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * This program demonstrates how to write data to a file using FileOutputStream in Java.
 * 
 * Key points:
 * - The file path is hardcoded and opened in append mode (`true`).
 * - A message is written to the file in byte form.
 * - Proper exception handling is implemented for both FileNotFoundException and IOException.
 * - A finally block ensures the output stream is closed to prevent resource leaks.
 */

public class FileWritingDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            // Open the file in append mode (true), meaning new data will be added to the end
            fileOutputStream = new FileOutputStream("D:\\Java IDE\\JavaTrainingPune\\src\\File\\message.text", true);

            String msg = "Wellcome Every One ";  // Message to be written

            // Convert the string into bytes and write to file
            fileOutputStream.write(msg.getBytes());

            System.out.println("Writing Message into file");

        } catch (FileNotFoundException exception) {
            // This block handles the case when the file path is invalid
            exception.printStackTrace();
        } catch (IOException e) {
            // Handles any I/O errors during writing or closing the file
            e.printStackTrace();
        } finally {
            try {
                // Close the stream to release system resources
                if (fileOutputStream != null) fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
