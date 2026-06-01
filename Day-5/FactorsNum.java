import java.util.Scanner;

public class FactorsNum {
    static void main() {
        System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i=1;i<=num;i++){
        if(num%i==0){
            System.out.print(i);
            if(num != i) {
                System.out.print(",");
            }
        }
    }

    }
}
