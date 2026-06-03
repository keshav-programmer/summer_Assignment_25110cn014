import java.util.Scanner;

public class RecursiveFactorial {
    static long factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factorial of " + num + " (recursive) = " + factorial(num));
        input.close();
    }
}
