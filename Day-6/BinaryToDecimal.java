import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binary = input.next();
        long decimal = 0;
        int power = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char ch = binary.charAt(i);
            if (ch == '1') decimal += (long) Math.pow(2, power);
            power++;
        }
        System.out.println("Decimal of " + binary + " = " + decimal);
        input.close();
    }
}
