import java.util.Scanner;

public class FunctionMaximum {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();


        System.out.println("Maximum = " + (a>b?a:b));
        input.close();
    }
}