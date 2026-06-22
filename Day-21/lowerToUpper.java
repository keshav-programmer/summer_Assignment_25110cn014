import java.util.Scanner;

public class lowerToUpper {
    static String convertToUpper(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') ch = (char)(ch - 32);
            result.append(ch);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Uppercase: " + convertToUpper(input));
        sc.close();
    }
}
