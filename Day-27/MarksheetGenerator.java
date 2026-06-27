import java.util.Scanner;

public class MarksheetGenerator {
    static String assignGrade(double avg) {
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Marksheet Generation System ===");
        System.out.print("Student Name: ");
        String sName = sc.nextLine();
        System.out.print("Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.print("Number of subjects: ");
        int subjectCount = sc.nextInt();
        sc.nextLine();

        String[] subjectNames = new String[subjectCount];
        int[]    subjectMarks = new int[subjectCount];
        int      totalMarks   = 0;
        boolean  hasFailed    = false;

        for (int i = 0; i < subjectCount; i++) {
            System.out.print("Subject " + (i + 1) + " name: ");
            subjectNames[i] = sc.nextLine();
            System.out.print("Marks (out of 100): ");
            subjectMarks[i] = sc.nextInt(); sc.nextLine();
            totalMarks += subjectMarks[i];
            if (subjectMarks[i] < 33) hasFailed = true;
        }

        double percentage = (double) totalMarks / subjectCount;
        String grade      = assignGrade(percentage);
        String result     = hasFailed ? "FAIL" : "PASS";

        System.out.println("\n========== MARKSHEET ==========");
        System.out.println("Name   : " + sName + "   Roll: " + rollNo);
        System.out.println("--------------------------------");
        for (int i = 0; i < subjectCount; i++) {
            System.out.printf("%-20s : %3d%n", subjectNames[i], subjectMarks[i]);
        }
        System.out.println("--------------------------------");
        System.out.printf("Total Marks : %d / %d%n", totalMarks, subjectCount * 100);
        System.out.printf("Percentage  : %.2f%%%n", percentage);
        System.out.println("Grade       : " + grade);
        System.out.println("Result      : " + result);
        System.out.println("================================");
        sc.close();
    }
}
