import java.util.Scanner;

public class CharTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(char i=1;i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}
