import java.util.Scanner;

public class CountWords {
    static int countWords(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) return 0;
        int wordCount = 1;
        for (int i = 1; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != ' ') wordCount++;
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String line = sc.nextLine();
        System.out.println("Word count = " + countWords(line));
        sc.close();
    }
}
