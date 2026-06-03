import java.util.Scanner;

public class RecursiveSumOfDigits {
    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (int)(n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = (num < 0) ? -num : num;
        System.out.println("Sum of digits of " + num + " (recursive) = " + sumDigits(temp));
        input.close();
    }
}
