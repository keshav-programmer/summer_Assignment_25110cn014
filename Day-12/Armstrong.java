import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = 0;
        int new_num = 0;
        while(num > 0){
            digit = num%10;
            new_num += Math.pow(digit,3);
            num /= 10;
        }
        System.out.print(new_num);
    }
}
