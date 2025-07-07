package mockinterview.mockinterview__2;

public class FabbanicSeries {

    // Method to print Fibonacci series up to 'n' terms
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            // Update values
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example usage: print 10 terms of Fibonacci series
        printFibonacci(10);
    }
}
