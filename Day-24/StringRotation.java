import java.util.Scanner;

public class StringRotation {

    static boolean isRotation(String original, String rotated) {
        if (original.length() != rotated.length()) return false;
        String doubled = original + original;
        // check if rotated appears as substring in doubled
        int len = rotated.length();
        for (int i = 0; i <= doubled.length() - len; i++) {
            boolean matched = true;
            for (int j = 0; j < len; j++) {
                if (doubled.charAt(i + j) != rotated.charAt(j)) {
                    matched = false;
                    break;
                }
            }
            if (matched) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();
        System.out.println("\"" + s2 + "\" is " + (isRotation(s1, s2) ? "" : "NOT ") + "a rotation of \"" + s1 + "\".");
        sc.close();
    }
}
