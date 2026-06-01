import java.util.Scanner;

public class LargestPrimeFact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        long n = num;
        long largestFactor = -1;
        while (n % 2 == 0) { largestFactor = 2; n /= 2; }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) { largestFactor = i; n /= i; }
        }
        if (n > 2) largestFactor = n;
        System.out.println("Largest prime factor of " + num + " = " + largestFactor);
        input.close();
    }
}
