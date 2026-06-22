import java.util.Scanner;

public class RemoveSpaces {
    static String stripSpaces(String text) {
        StringBuilder compacted = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') compacted.append(text.charAt(i));
        }
        return compacted.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        System.out.println("Without spaces: " + stripSpaces(input));
        sc.close();
    }
}
