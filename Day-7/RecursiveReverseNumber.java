import java.util.Scanner;

public class RecursiveReverseNumber {
    static int reversed = 0;
    static int multiplier = 1;

    static void reverseHelper(int n) {
        if (n == 0) return;
        reverseHelper(n / 10);
        reversed += (n % 10) * multiplier;
        multiplier *= 10;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = (num < 0) ? -num : num;
        reverseHelper(temp);
        System.out.println("Reversed number (recursive) = " + (num < 0 ? -reversed : reversed));
        input.close();
    }
}
