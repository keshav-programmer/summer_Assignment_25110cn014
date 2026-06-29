import java.util.Scanner;

public class ContactManagment {
    static final int MAX_CONTACTS = 50;
    static String[] contactName   = new String[MAX_CONTACTS];
    static String[] contactPhone  = new String[MAX_CONTACTS];
    static String[] contactEmail  = new String[MAX_CONTACTS];
    static int      contactCount  = 0;

    static void addContact(Scanner sc) {
        if (contactCount >= MAX_CONTACTS) { System.out.println("Contact list full."); return; }
        System.out.print("Enter name  : "); contactName[contactCount]  = sc.nextLine();
        System.out.print("Enter phone : "); contactPhone[contactCount] = sc.nextLine();
        System.out.print("Enter email : "); contactEmail[contactCount] = sc.nextLine();
        contactCount++;
        System.out.println("Contact saved successfully.");
    }

    static void showAllContacts() {
        if (contactCount == 0) { System.out.println("No contacts saved."); return; }
        System.out.println("\n--- Contact List ---");
        System.out.printf("%-5s %-18s %-15s %-25s%n", "No.", "Name", "Phone", "Email");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < contactCount; i++) {
            System.out.printf("%-5d %-18s %-15s %-25s%n",
                    (i + 1), contactName[i], contactPhone[i], contactEmail[i]);
        }
    }

    static void searchContact(Scanner sc) {
        System.out.print("Enter name to search: ");
        String query = sc.nextLine().toLowerCase();
        boolean found = false;
        for (int i = 0; i < contactCount; i++) {
            if (contactName[i].toLowerCase().contains(query)) {
                System.out.println("Found -> " + contactName[i] + " | " + contactPhone[i] + " | " + contactEmail[i]);
                found = true;
            }
        }
        if (!found) System.out.println("No contact matching \"" + query + "\" found.");
    }

    static void deleteContact(Scanner sc) {
        System.out.print("Enter name to delete: ");
        String target = sc.nextLine().toLowerCase();
        for (int i = 0; i < contactCount; i++) {
            if (contactName[i].toLowerCase().equals(target)) {
                for (int j = i; j < contactCount - 1; j++) {
                    contactName[j]  = contactName[j + 1];
                    contactPhone[j] = contactPhone[j + 1];
                    contactEmail[j] = contactEmail[j + 1];
                }
                contactCount--;
                System.out.println("Contact deleted.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt;
        do {
            System.out.println("\n=== Contact Management System ===");
            System.out.println("1.Add  2.View All  3.Search  4.Delete  5.Exit");
            System.out.print("Option: ");
            opt = sc.nextInt(); sc.nextLine();
            switch (opt) {
                case 1: addContact(sc);    break;
                case 2: showAllContacts(); break;
                case 3: searchContact(sc); break;
                case 4: deleteContact(sc); break;
                case 5: System.out.println("Contact app closed."); break;
                default: System.out.println("Invalid option.");
            }
        } while (opt != 5);
        sc.close();
    }
}
