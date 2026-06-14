import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dup = 0;

        for(int i = 1; i<num;i++){
            if(num%i == 0){
                dup += i;
            }
        }
        if(dup == num){
            System.out.print("Number is Perfect");
        }else{
            System.out.print("Number is not perfect");
        }
    }
}
