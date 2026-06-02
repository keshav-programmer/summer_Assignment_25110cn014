import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int count = 0;
        int temp = num;
        while (temp > 0) {
            count += temp & 1;
            temp >>= 1;
        }
        System.out.println("Number of set bits in " + num + " = " + count);
        input.close();
    }
}
