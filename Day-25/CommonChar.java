import java.util.Scanner;

public class CommonChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        boolean[] printedAlready = new boolean[256];
        System.out.print("Common characters: ");
        boolean anyFound = false;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (!printedAlready[ch]) {
                for (int j = 0; j < str2.length(); j++) {
                    if (str2.charAt(j) == ch) {
                        System.out.print("'" + ch + "' ");
                        printedAlready[ch] = true;
                        anyFound = true;
                        break;
                    }
                }
            }
        }
        if (!anyFound) System.out.print("None");
        System.out.println();
        sc.close();
    }
}
