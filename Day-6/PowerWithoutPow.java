import java.util.Scanner;

public class PowerWithoutPow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        double x = input.nextDouble();
        System.out.print("Enter exponent (n): ");
        int n = input.nextInt();
        double result = 1.0;
        int absN = (n < 0) ? -n : n;
        for (int i = 0; i < absN; i++) result *= x;
        if (n < 0) result = 1.0 / result;
        System.out.println(x + "^" + n + " = " + result);
        input.close();
    }
}
