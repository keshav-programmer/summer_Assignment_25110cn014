import java.util.Scanner;

public class BankAccountSystem {

    static double accountBal = 0.0;
    static String[] txnHistory = new String[100];
    static int txnCount = 0;

    static void deposit(double amount) {
        accountBal += amount;
        txnHistory[txnCount++] = "Deposited  : Rs. " + String.format("%.2f", amount);
        System.out.printf("Rs. %.2f deposited. Balance: Rs. %.2f%n", amount, accountBal);
    }

    static void withdraw(double amount) {
        if (amount > accountBal) { System.out.println("Insufficient balance."); return; }
        accountBal -= amount;
        txnHistory[txnCount++] = "Withdrawn  : Rs. " + String.format("%.2f", amount);
        System.out.printf("Rs. %.2f withdrawn. Balance: Rs. %.2f%n", amount, accountBal);
    }

    static void miniStatement() {
        System.out.println("\n--- Mini Statement (Last 5 Transactions) ---");
        int startIdx = Math.max(0, txnCount - 5);
        for (int i = startIdx; i < txnCount; i++) System.out.println(txnHistory[i]);
        System.out.printf("Current Balance: Rs. %.2f%n", accountBal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== GL Bajaj Bank Account System ===");
        System.out.print("Enter account holder name: ");
        String holderName = sc.nextLine();
        System.out.print("Enter opening deposit: Rs. ");
        deposit(sc.nextDouble()); sc.nextLine();

        int choice;
        do {
            System.out.println("\nWelcome, " + holderName);
            System.out.println("1.Deposit  2.Withdraw  3.Balance  4.Statement  5.Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Amount to deposit: Rs. ");
                    deposit(sc.nextDouble()); sc.nextLine(); break;
                case 2:
                    System.out.print("Amount to withdraw: Rs. ");
                    withdraw(sc.nextDouble()); sc.nextLine(); break;
                case 3:
                    System.out.printf("Available Balance: Rs. %.2f%n", accountBal); break;
                case 4: miniStatement(); break;
                case 5: System.out.println("Thank you for banking with us!"); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 5);
        sc.close();
    }
}
