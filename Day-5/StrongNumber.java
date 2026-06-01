import java.util.Scanner;

public class StrongNumber {
    static int factorial(int n){
        if(n==0 || n==1) return 1;
        int fact=1;
        while(n!=1){
            fact=fact*n;
            n--;
        }
        return fact;
    }
    public static void main(String[] args) {
           System.out.print("Enter a Number: ");
           Scanner sc = new Scanner(System.in);
           int num  = sc.nextInt();
           int original = num;
           int sum = 0;

           while(num!=0){
               int digit = num%10;
               sum += factorial(digit);
               num/=10;
           }
           if(sum == original){
               System.out.println("number is a strong number");
           }else{
               System.out.println("number is not a strong number");
           }
    }
}
