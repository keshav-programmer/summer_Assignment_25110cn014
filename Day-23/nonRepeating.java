import java.util.Scanner;

public class nonRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        char uniqueChar = 0;
        boolean found = false;

        for (int i = 0; i < text.length(); i++) {
            char candidate = text.charAt(i);
            int occurrences = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == candidate) occurrences++;
            }
            if (occurrences == 1) {
                uniqueChar = candidate;
                found = true;
                break;
            }
        }
        if (found) System.out.println("First non-repeating character = '" + uniqueChar + "'");
        else System.out.println("No non-repeating character found.");
        sc.close();
    }
}
