import java.util.Scanner;

public class CharFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        boolean[] alreadyPrinted = new boolean[256];

        System.out.println("Character frequencies:");
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!alreadyPrinted[current]) {
                int tally = 0;
                for (int j = 0; j < text.length(); j++) {
                    if (text.charAt(j) == current) tally++;
                }
                System.out.println("'" + current + "' -> " + tally);
                alreadyPrinted[current] = true;
            }
        }
        sc.close();
    }
}
