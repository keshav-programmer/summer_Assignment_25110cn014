import java.util.Scanner;

public class StringLength {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(char c:s.toCharArray()){
            count++;
        }
        System.out.print("Length of String is : " + count);
    }
}
