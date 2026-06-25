import java.util.Scanner;

public class RemoveDuplicateChar {
    static String eliminateDuplicates(String text) {
        StringBuilder unique = new StringBuilder();
        boolean[] encountered = new boolean[256];
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!encountered[ch]) {
                unique.append(ch);
                encountered[ch] = true;
            }
        }
        return unique.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("After removing duplicate characters: " + eliminateDuplicates(input));
        sc.close();
    }
}
