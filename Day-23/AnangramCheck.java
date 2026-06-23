import java.util.Scanner;

public class AnangramCheck {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        int[] charCount = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            charCount[s1.charAt(i)]++;
            charCount[s2.charAt(i)]--;
        }
        for (int freq : charCount) {
            if (freq != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String word2 = sc.nextLine();
        boolean result = areAnagrams(word1.toLowerCase(), word2.toLowerCase());
        System.out.println("\"" + word1 + "\" and \"" + word2 + "\" are " + (result ? "" : "NOT ") + "anagrams.");
        sc.close();
    }
}
