import java.util.Scanner;

public class VoteSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double accountBalance = 10000.00;
        int secretPin = 1234;

        System.out.println("=== Welcome to GL Bajaj ATM ===");
        System.out.print("Enter your PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin != secretPin) {
            System.out.println("Incorrect PIN. Access denied.");
            sc.close();
            return;
        }

        System.out.println("PIN verified. Access granted.");
        int userChoice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Cash");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit");
            System.out.print("Select option: ");
            userChoice = sc.nextInt();

            switch (userChoice) {
                case 1:
                    System.out.printf("Current Balance: Rs. %.2f%n", accountBalance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmt = sc.nextDouble();
                    if (depositAmt > 0) {
                        accountBalance += depositAmt;
                        System.out.printf("Rs. %.2f deposited. New Balance: Rs. %.2f%n", depositAmt, accountBalance);
                    } else System.out.println("Invalid amount.");
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawAmt = sc.nextDouble();
                    if (withdrawAmt <= 0) System.out.println("Invalid amount.");
                    else if (withdrawAmt > accountBalance) System.out.println("Insufficient funds.");
                    else {
                        accountBalance -= withdrawAmt;
                        System.out.printf("Rs. %.2f withdrawn. Remaining Balance: Rs. %.2f%n", withdrawAmt, accountBalance);
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using GL Bajaj ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        } while (userChoice != 4);
        sc.close();
    }
}
