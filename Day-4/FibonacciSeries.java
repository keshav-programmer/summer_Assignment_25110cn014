import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many terms of Fibonacci series to display? ");
        int terms = input.nextInt();

        long prev = 0, curr = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(prev + " ");
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        System.out.println();
        input.close();
    }
}
