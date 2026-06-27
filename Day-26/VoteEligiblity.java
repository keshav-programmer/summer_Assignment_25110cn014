import java.util.Scanner;

public class VoteEligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Voting Eligibility Checker ===");
        System.out.print("Enter your name: ");
        String voterName = sc.nextLine();
        System.out.print("Enter your age: ");
        int voterAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Are you a citizen? (yes/no): ");
        String citizenStatus = sc.nextLine().trim().toLowerCase();

        boolean ageCriteria = voterAge >= 18;
        boolean citizenCriteria = citizenStatus.equals("yes");

        System.out.println("\n--- Eligibility Report ---");
        System.out.println("Name      : " + voterName);
        System.out.println("Age       : " + voterAge);
        System.out.println("Citizen   : " + citizenStatus);

        if (ageCriteria && citizenCriteria) {
            System.out.println("Status    : ELIGIBLE to vote.");
        } else if (!ageCriteria) {
            System.out.println("Status    : NOT ELIGIBLE. Minimum age required is 18.");
        } else {
            System.out.println("Status    : NOT ELIGIBLE. Only citizens can vote.");
        }
        sc.close();
    }
}
