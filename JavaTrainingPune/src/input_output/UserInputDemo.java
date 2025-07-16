package input_output;  // Declares the package

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program demonstrates:
 * - Taking user input from the console using BufferedReader.
 * - Writing the input message to a file using FileOutputStream.
 * - Using exception handling and proper resource cleanup.
 */
public class UserInputDemo {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        BufferedReader bufferedReader = null;

        try {
            // Create an InputStreamReader to read bytes from console and decode into characters
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            // Wrap InputStreamReader with BufferedReader for efficient reading
            bufferedReader = new BufferedReader(inputStreamReader);

            // Prompt the user to enter a message
            System.out.println("Enter the Message");

            // Read one line of input from the console
            String msg = bufferedReader.readLine();

            // Display the entered message on the console
            System.out.println("Message is : " + msg);

            // Create FileOutputStream to write the message to a file (append mode)
            fileOutputStream = new FileOutputStream("D:\\Java IDE\\JavaTrainingPune\\src\\File\\message.text", true);

            // Convert the string message to bytes and write to file
            fileOutputStream.write(msg.getBytes());

            // Write a newline character (for better readability in the file)
            fileOutputStream.write(System.lineSeparator().getBytes());

            System.out.println("Writing the message to the file (done).........");

        } catch (IOException e) {
            // Handle all input/output exceptions
            e.printStackTrace();
        } finally {
            // Ensure both streams are closed to release system resources
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}
