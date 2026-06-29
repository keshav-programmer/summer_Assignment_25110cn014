import java.util.Scanner;

public class LibraryManagment {
    static final int SHELF_SIZE  = 50;
    static int[]    bookId       = new int[SHELF_SIZE];
    static String[] bookTitle    = new String[SHELF_SIZE];
    static String[] bookAuthor   = new String[SHELF_SIZE];
    static boolean[] isAvailable = new boolean[SHELF_SIZE];
    static int      bookCount    = 0;

    static void addBook(Scanner sc) {
        if (bookCount >= SHELF_SIZE) { System.out.println("Library shelf full."); return; }
        System.out.print("Book ID: ");     bookId[bookCount]     = sc.nextInt(); sc.nextLine();
        System.out.print("Title: ");       bookTitle[bookCount]  = sc.nextLine();
        System.out.print("Author: ");      bookAuthor[bookCount] = sc.nextLine();
        isAvailable[bookCount] = true;
        bookCount++;
        System.out.println("Book added to library.");
    }

    static void showAllBooks() {
        System.out.println("\n--- Library Catalogue ---");
        System.out.printf("%-6s %-25s %-20s %-10s%n", "ID", "Title", "Author", "Status");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < bookCount; i++) {
            System.out.printf("%-6d %-25s %-20s %-10s%n",
                    bookId[i], bookTitle[i], bookAuthor[i],
                    isAvailable[i] ? "Available" : "Issued");
        }
    }

    static void issueBook(Scanner sc) {
        System.out.print("Enter Book ID to issue: ");
        int id = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (bookId[i] == id) {
                if (isAvailable[i]) { isAvailable[i] = false; System.out.println("Book issued successfully."); }
                else System.out.println("Book is already issued.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    static void returnBook(Scanner sc) {
        System.out.print("Enter Book ID to return: ");
        int id = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (bookId[i] == id) {
                if (!isAvailable[i]) { isAvailable[i] = true; System.out.println("Book returned. Thank you!"); }
                else System.out.println("This book was not issued.");
                return;
            }
        }
        System.out.println("Book ID not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n=== Library Management System ===");
            System.out.println("1.Add Book  2.View All  3.Issue Book  4.Return Book  5.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt(); sc.nextLine();
            switch (ch) {
                case 1: addBook(sc);    break;
                case 2: showAllBooks(); break;
                case 3: issueBook(sc);  break;
                case 4: returnBook(sc); break;
                case 5: System.out.println("Library system closed."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (ch != 5);
        sc.close();
    }
}
