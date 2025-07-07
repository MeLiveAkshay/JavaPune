package mockinterview.mockinterview__3;

import java.util.Scanner;

public class ArrayProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Array (n): ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the Elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Output (sum of all digits of each number):");
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int sum = 0;

            while (number > 0) {
                sum += number % 10;  // Get last digit
                number /= 10;        // Remove last digit
            }

            System.out.print(sum + " ");
        }

        sc.close();
    }
}
