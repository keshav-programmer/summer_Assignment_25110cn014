import java.util.Scanner;

public class ArmstrongInRange {
    static boolean isArmstrong(int n) {
        int temp = n, digits = 0;
        while (temp > 0) { digits++; temp /= 10; }
        temp = n;
        int total = 0;
        while (temp > 0) {
            int d = temp % 10;
            int pw = 1;
            for (int i = 0; i < digits; i++) pw *= d;
            total += pw;
            temp /= 10;
        }
        return total == n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        int start = input.nextInt();
        System.out.print("Enter end of range: ");
        int end = input.nextInt();
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) System.out.print(i + " ");
        }
        System.out.println();
        input.close();
    }
}
