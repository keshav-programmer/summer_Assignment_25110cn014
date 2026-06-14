import java.util.Scanner;

public class factorial2 {
    public static int fact(int n){
        int result = 1;
        if(n>1){
            return result = n*fact(n-1);
        }else{
            return result;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(fact(n));

    }
}
