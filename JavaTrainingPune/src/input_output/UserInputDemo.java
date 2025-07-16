package input_output;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputDemo {
    public static void main(String[] args) {
        try {
            // Create an InputStreamReader to read bytes from the console and decode them into characters
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            // Wrap the InputStreamReader with a BufferedReader for efficient reading of text
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            // Prompt the user to enter a message
            System.out.println("Enter the Message");

            // Read a line of text entered by the user
            String msg = bufferedReader.readLine();

            // Display the entered message
            System.out.println("Message is : " + msg);
        } catch (IOException e) {
            // Print the stack trace if an I/O error occurs
            e.printStackTrace();
        }
    }
}

/*
This program demonstrates how to take user input in Java using BufferedReader.
- It reads a line of text from the console.
- BufferedReader provides efficient reading of characters, arrays, and lines.
- InputStreamReader bridges byte streams (System.in) to character streams.
- Exception handling ensures the program deals gracefully with I/O errors.
*/
