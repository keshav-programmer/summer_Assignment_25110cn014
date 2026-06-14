import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int a = input.nextInt();

        boolean bool = true;

        if (a < 2) {
            bool = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    bool = false;
                    break;
                }
            }
        }

        if (bool) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }

        input.close();
    }
}