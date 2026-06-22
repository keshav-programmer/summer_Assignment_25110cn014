import java.util.Scanner;

public class palindrom {
    static boolean checkStringPalindrome(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        System.out.println("\"" + word + "\" is " + (checkStringPalindrome(word) ? "" : "NOT ") + "a palindrome.");
        sc.close();
    }
}
