import java.util.Scanner;

public class AlphaSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names to sort? ");
        int count = sc.nextInt();
        sc.nextLine();
        String[] nameList = new String[count];
        System.out.println("Enter names:");
        for (int i = 0; i < count; i++) nameList[i] = sc.nextLine();

        // Bubble sort on strings using compareTo
        for (int pass = 0; pass < count - 1; pass++) {
            for (int j = 0; j < count - pass - 1; j++) {
                if (nameList[j].compareToIgnoreCase(nameList[j + 1]) > 0) {
                    String hold = nameList[j];
                    nameList[j] = nameList[j + 1];
                    nameList[j + 1] = hold;
                }
            }
        }
        System.out.println("Names in alphabetical order:");
        for (String name : nameList) System.out.println("  " + name);
        sc.close();
    }
}
