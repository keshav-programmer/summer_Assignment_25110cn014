import java.util.Scanner;

public class MenuCalculator {
    static double add(double a, double b)      { return a + b; }
    static double subtract(double a, double b) { return a - b; }
    static double multiply(double a, double b) { return a * b; }
    static double divide(double a, double b)   { return b != 0 ? a / b : Double.NaN; }
    static double modulus(double a, double b)  { return b != 0 ? a % b : Double.NaN; }
    static double power(double base, double exp) {
        double result = 1;
        for (int i = 0; i < (int) exp; i++) result *= base;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;
        do {
            System.out.println("\n========= Calculator Menu =========");
            System.out.println("1. Addition         2. Subtraction");
            System.out.println("3. Multiplication   4. Division");
            System.out.println("5. Modulus          6. Power (x^n)");
            System.out.println("7. Exit");
            System.out.print("Select operation: ");
            selection = sc.nextInt();
            if (selection >= 1 && selection <= 6) {
                System.out.print("Enter first number : ");
                double numA = sc.nextDouble();
                System.out.print("Enter second number: ");
                double numB = sc.nextDouble();
                double outcome;
                String opLabel = "";
                switch (selection) {
                    case 1: outcome = add(numA, numB);      opLabel = "+"; break;
                    case 2: outcome = subtract(numA, numB); opLabel = "-"; break;
                    case 3: outcome = multiply(numA, numB); opLabel = "*"; break;
                    case 4: outcome = divide(numA, numB);   opLabel = "/"; break;
                    case 5: outcome = modulus(numA, numB);  opLabel = "%"; break;
                    default: outcome = power(numA, numB);   opLabel = "^"; break;
                }
                if (Double.isNaN(outcome))
                    System.out.println("Error: Division by zero is undefined.");
                else
                    System.out.printf("Result: %.4f %s %.4f = %.4f%n", numA, opLabel, numB, outcome);
            } else if (selection != 7) {
                System.out.println("Invalid option. Choose 1-7.");
            }
        } while (selection != 7);
        System.out.println("Calculator closed.");
        sc.close();
    }
}
