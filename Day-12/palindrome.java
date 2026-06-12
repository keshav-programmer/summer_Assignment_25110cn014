import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        boolean bool = true;

        for(int i = 0; i<len/2;i++){
            if(str.charAt(i) != str.charAt(len-i-1)){
                bool = false;
            }
        }
        if(bool == true){
            System.out.print("Palindrome");
        }else{
            System.out.print("Not a palindrome");
        }
        sc.close();

    }
}
