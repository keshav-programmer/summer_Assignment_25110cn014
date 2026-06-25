import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        String longestWord = "";
        String currentWord = "";

        for (int i = 0; i <= sentence.length(); i++) {
            if (i < sentence.length() && sentence.charAt(i) != ' ') {
                currentWord += sentence.charAt(i);
            } else {
                if (currentWord.length() > longestWord.length()) longestWord = currentWord;
                currentWord = "";
            }
        }
        System.out.println("Longest word = \"" + longestWord + "\" (length: " + longestWord.length() + ")");
        sc.close();
    }
}
