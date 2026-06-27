import java.util.Scanner;

public class EmployeeManagment {
    static final int CAPACITY = 50;
    static int[]    empId         = new int[CAPACITY];
    static String[] empName       = new String[CAPACITY];
    static String[] empDepartment = new String[CAPACITY];
    static double[] empSalary     = new double[CAPACITY];
    static int      empCount      = 0;

    static void registerEmployee(Scanner sc) {
        if (empCount >= CAPACITY) { System.out.println("Capacity reached."); return; }
        System.out.print("Employee ID: ");     empId[empCount]         = sc.nextInt(); sc.nextLine();
        System.out.print("Employee Name: ");   empName[empCount]       = sc.nextLine();
        System.out.print("Department: ");      empDepartment[empCount] = sc.nextLine();
        System.out.print("Salary: Rs. ");      empSalary[empCount]     = sc.nextDouble(); sc.nextLine();
        empCount++;
        System.out.println("Employee registered successfully.");
    }

    static void listAllEmployees() {
        if (empCount == 0) { System.out.println("No employees on record."); return; }
        System.out.println("\n--- Employee Directory ---");
        System.out.printf("%-6s %-18s %-15s %-10s%n", "ID", "Name", "Department", "Salary");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < empCount; i++) {
            System.out.printf("%-6d %-18s %-15s Rs.%-10.2f%n",
                    empId[i], empName[i], empDepartment[i], empSalary[i]);
        }
    }

    static void findEmployee(Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < empCount; i++) {
            if (empId[i] == searchId) {
                System.out.println("ID: " + empId[i] + " | Name: " + empName[i] +
                        " | Dept: " + empDepartment[i] + " | Salary: Rs." + empSalary[i]);
                return;
            }
        }
        System.out.println("Employee ID " + searchId + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option;
        do {
            System.out.println("\n--- Employee Management ---");
            System.out.println("1. Add Employee  2. View All  3. Search  4. Exit");
            System.out.print("Option: ");
            option = sc.nextInt(); sc.nextLine();
            switch (option) {
                case 1: registerEmployee(sc); break;
                case 2: listAllEmployees();   break;
                case 3: findEmployee(sc);     break;
                case 4: System.out.println("Goodbye!"); break;
                default: System.out.println("Invalid selection.");
            }
        } while (option != 4);
        sc.close();
    }
}
