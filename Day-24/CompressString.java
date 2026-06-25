import java.util.Scanner;

public class CompressString {
    static String runLengthCompress(String text) {
        if (text.isEmpty()) return text;
        StringBuilder compressed = new StringBuilder();
        int idx = 0;
        while (idx < text.length()) {
            char currentChar = text.charAt(idx);
            int groupCount = 1;
            while (idx + groupCount < text.length() && text.charAt(idx + groupCount) == currentChar) {
                groupCount++;
            }
            compressed.append(currentChar);
            if (groupCount > 1) compressed.append(groupCount);
            idx += groupCount;
        }
        return compressed.length() < text.length() ? compressed.toString() : text;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to compress: ");
        String input = sc.nextLine();
        System.out.println("Compressed: " + runLengthCompress(input));
        sc.close();
    }
}
