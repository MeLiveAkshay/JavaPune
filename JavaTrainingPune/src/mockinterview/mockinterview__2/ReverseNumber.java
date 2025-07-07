package mockinterview.mockinterview__2;
import java.util.Scanner;

public class ReverseNumber {

    // Method to reverse the digits of a number
    public static int reverseDigits(int num) {
        int reversed = 0;

        // Loop until all digits are processed
        while (num != 0) {
            int digit = num % 10;             // Get the last digit
            reversed = reversed * 10 + digit; // Add digit to reversed number
            num /= 10;                        // Remove the last digit from num
        }

        return reversed; // Return the reversed number
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int input = scanner.nextInt();            // Read integer input from user

            int output = reverseDigits(input);        // Call method to reverse digits

            System.out.println("Reversed number: " + output); // Print the reversed number
        }
    }
}
