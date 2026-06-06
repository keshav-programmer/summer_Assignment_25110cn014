import java.util.Scanner;

public class CharPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= n - i; sp++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print((char)('A' + j));
            }
            for (int j = i - 2; j >= 0; j--){
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}
