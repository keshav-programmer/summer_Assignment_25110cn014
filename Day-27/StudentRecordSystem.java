import java.util.Scanner;

public class StudentRecordSystem {
    static final int MAX_STUDENTS = 50;
    static String[] studentName  = new String[MAX_STUDENTS];
    static int[]    studentRoll  = new int[MAX_STUDENTS];
    static double[] studentMarks = new double[MAX_STUDENTS];
    static int      totalStudents = 0;

    static void addStudent(Scanner sc) {
        if (totalStudents >= MAX_STUDENTS) { System.out.println("Storage full."); return; }
        System.out.print("Enter name: ");       studentName[totalStudents]  = sc.nextLine();
        System.out.print("Enter roll number: "); studentRoll[totalStudents]  = sc.nextInt();
        System.out.print("Enter marks: ");       studentMarks[totalStudents] = sc.nextDouble();
        sc.nextLine();
        totalStudents++;
        System.out.println("Student record saved.");
    }

    static void displayAll() {
        if (totalStudents == 0) { System.out.println("No records found."); return; }
        System.out.println("\n--- All Student Records ---");
        System.out.printf("%-5s %-20s %-10s%n", "Roll", "Name", "Marks");
        System.out.println("---------------------------------------");
        for (int i = 0; i < totalStudents; i++) {
            System.out.printf("%-5d %-20s %-10.2f%n", studentRoll[i], studentName[i], studentMarks[i]);
        }
    }

    static void searchByRoll(Scanner sc) {
        System.out.print("Enter roll number to search: ");
        int rollQuery = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < totalStudents; i++) {
            if (studentRoll[i] == rollQuery) {
                System.out.println("Found -> Name: " + studentName[i] + ", Marks: " + studentMarks[i]);
                return;
            }
        }
        System.out.println("Student with roll " + rollQuery + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Student Record Management ---");
            System.out.println("1. Add Student  2. Display All  3. Search  4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt(); sc.nextLine();
            switch (choice) {
                case 1: addStudent(sc); break;
                case 2: displayAll();   break;
                case 3: searchByRoll(sc); break;
                case 4: System.out.println("Exiting system."); break;
                default: System.out.println("Invalid option.");
            }
        } while (choice != 4);
        sc.close();
    }
}
