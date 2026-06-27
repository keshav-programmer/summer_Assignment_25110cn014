import java.util.Scanner;

public class SalaryManagment {
    static double computeHRA(double basic)       { return basic * 0.20; }
    static double computeDA(double basic)        { return basic * 0.50; }
    static double computePF(double basic)        { return basic * 0.12; }
    static double computeTax(double gross)       { return gross * 0.10; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Salary Management System ===");
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter Basic Salary: Rs. ");
        double basicSalary = sc.nextDouble();

        double hraAllowance    = computeHRA(basicSalary);
        double daAllowance     = computeDA(basicSalary);
        double grossSalary     = basicSalary + hraAllowance + daAllowance;
        double pfDeduction     = computePF(basicSalary);
        double taxDeduction    = computeTax(grossSalary);
        double totalDeductions = pfDeduction + taxDeduction;
        double netSalary       = grossSalary - totalDeductions;

        System.out.println("\n--- Salary Slip ---");
        System.out.println("Employee : " + name + "  |  ID: " + id);
        System.out.println("-----------------------------------");
        System.out.printf("Basic Salary     : Rs. %10.2f%n", basicSalary);
        System.out.printf("HRA (20%%)        : Rs. %10.2f%n", hraAllowance);
        System.out.printf("DA  (50%%)        : Rs. %10.2f%n", daAllowance);
        System.out.printf("Gross Salary     : Rs. %10.2f%n", grossSalary);
        System.out.println("-----------------------------------");
        System.out.printf("PF  (12%%)        : Rs. %10.2f%n", pfDeduction);
        System.out.printf("Tax (10%%)        : Rs. %10.2f%n", taxDeduction);
        System.out.printf("Total Deductions : Rs. %10.2f%n", totalDeductions);
        System.out.println("-----------------------------------");
        System.out.printf("Net Salary       : Rs. %10.2f%n", netSalary);
        sc.close();
    }
}
