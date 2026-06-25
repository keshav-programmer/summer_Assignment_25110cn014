import java.util.Scanner;

public class SortWordByLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();
        String[] wordTokens = sentence.split("\\s+");

        // Selection sort by word length
        for (int i = 0; i < wordTokens.length - 1; i++) {
            int shortestIdx = i;
            for (int j = i + 1; j < wordTokens.length; j++) {
                if (wordTokens[j].length() < wordTokens[shortestIdx].length()) shortestIdx = j;
            }
            String hold = wordTokens[i];
            wordTokens[i] = wordTokens[shortestIdx];
            wordTokens[shortestIdx] = hold;
        }
        System.out.print("Words sorted by length: ");
        for (String w : wordTokens) System.out.print(w + " ");
        System.out.println();
        sc.close();
    }
}
