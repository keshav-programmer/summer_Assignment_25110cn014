import java.util.Scanner;

public class firstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char repeatedChar = 0;
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char candidate = text.charAt(i);
            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(j) == candidate) {
                    repeatedChar = candidate;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        if (found) System.out.println("First repeating character = '" + repeatedChar + "'");
        else System.out.println("No repeating character found.");
        sc.close();
    }
}
