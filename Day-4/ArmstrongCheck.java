import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int temp = num, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }
        temp = num;
        int armSum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digits; i++) power *= digit;
            armSum += power;
            temp /= 10;
        }
        System.out.println(num + (armSum == num ? " is an Armstrong number." : " is NOT an Armstrong number."));
        input.close();
    }
}
