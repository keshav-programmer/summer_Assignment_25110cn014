import java.util.Scanner;

public class RecursiveFibonacci {
    static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter position N: ");
        int n = input.nextInt();
        System.out.println("Fibonacci at position " + n + " (recursive) = " + fib(n));
        input.close();
    }
}
