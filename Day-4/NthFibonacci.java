import java.util.Scanner;

public class NthFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position N: ");
        int n = input.nextInt();
        long a = 0, b = 1;
        if (n == 1) {
            System.out.println("Fibonacci term at position " + n + " = " + a);
        } else if (n == 2) {
            System.out.println("Fibonacci term at position " + n + " = " + b);
        } else {
            for (int i = 3; i <= n; i++) {
                long c = a + b;
                a = b;
                b = c;
            }
            System.out.println("Fibonacci term at position " + n + " = " + b);
        }
        input.close();
    }
}
