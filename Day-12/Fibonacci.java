import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers of term of fibonacci sequence: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int next = a + b;
        System.out.print(a + "," + b + ",");
        for(int i = 0; i<n-2 ; i++){
            System.out.print(next + ",");
            a = b;
            b = next;
            next = a+b;
        }
    }
}
