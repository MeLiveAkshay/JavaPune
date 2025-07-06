package mockinterview.mockinterview__1;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner to take input

        System.out.print("Enter an integer number: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();

            if (number % 2 == 0) {
                System.out.println("✅ " + number + " is an Even number.");
            } else {
                System.out.println("❌ " + number + " is an Odd number.");
            }
        } else {
            System.out.println("⚠️ Invalid input! Please enter a valid integer number.");
        }

        sc.close(); // Close scanner to avoid resource leak
    }
}
