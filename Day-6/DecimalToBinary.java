import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        long num = input.nextLong();
        if (num == 0) {
            System.out.println("Binary: 0");
            return;
        }
        long temp = (num < 0) ? -num : num;
        StringBuilder binary = new StringBuilder();
        while (temp > 0) {
            binary.insert(0, temp % 2);
            temp /= 2;
        }
        if (num < 0) {
            binary.insert(0, "-");
        }
        System.out.println("Binary of " + num + " = " + binary);
        input.close();
    }
}
