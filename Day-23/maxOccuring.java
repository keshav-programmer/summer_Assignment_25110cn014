import java.util.Scanner;

public class maxOccuring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;

        char dominantChar = text.charAt(0);
        int peakFreq = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] > peakFreq) {
                peakFreq = freq[ch];
                dominantChar = ch;
            }
        }
        System.out.println("Maximum occurring character = '" + dominantChar + "' (appears " + peakFreq + " times)");
        sc.close();
    }
}
