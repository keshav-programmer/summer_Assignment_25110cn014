import java.util.Scanner;

public class StringOperationMenu {
    static String activeString = "";

    static void reverseIt()          { StringBuilder sb = new StringBuilder(activeString); System.out.println("Reversed: " + sb.reverse()); }
    static void checkPalindrome()    {
        String rev = new StringBuilder(activeString).reverse().toString();
        System.out.println(activeString + " is " + (activeString.equalsIgnoreCase(rev) ? "" : "NOT ") + "a palindrome.");
    }
    static void countVowelsCons()    {
        int v = 0, c = 0;
        for (char ch : activeString.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiouAEIOU".indexOf(ch) >= 0) v++; else c++;
            }
        }
        System.out.println("Vowels: " + v + "  Consonants: " + c);
    }
    static void toUpperLower()       { System.out.println("Upper: " + activeString.toUpperCase() + "  |  Lower: " + activeString.toLowerCase()); }
    static void showLength()         { System.out.println("Length = " + activeString.length()); }
    static void removeAllSpaces()    { System.out.println("No spaces: " + activeString.replaceAll(" ", "")); }
    static void countWordCount()     {
        String trimmed = activeString.trim();
        int wc = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
        System.out.println("Word count = " + wc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n=== String Operations Menu ===");
            System.out.println("1.Enter String   2.Reverse       3.Palindrome Check");
            System.out.println("4.Vowels/Cons    5.Upper/Lower   6.Length");
            System.out.println("7.Remove Spaces  8.Word Count    9.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt(); sc.nextLine();
            switch (ch) {
                case 1: System.out.print("Enter string: "); activeString = sc.nextLine(); break;
                case 2: reverseIt();       break;
                case 3: checkPalindrome(); break;
                case 4: countVowelsCons(); break;
                case 5: toUpperLower();    break;
                case 6: showLength();      break;
                case 7: removeAllSpaces(); break;
                case 8: countWordCount();  break;
                case 9: System.out.println("String menu closed."); break;
                default: System.out.println("Invalid option.");
            }
        } while (ch != 9);
        sc.close();
    }
}
