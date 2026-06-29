import java.util.Scanner;

public class ArrayOperationMenu {

    static int[] dataSet  = new int[100];
    static int   dataSize = 0;

    static void loadArray(Scanner sc) {
        System.out.print("Enter number of elements: ");
        dataSize = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < dataSize; i++) dataSet[i] = sc.nextInt();
        System.out.println("Array loaded.");
    }

    static void printArray() {
        System.out.print("Current array: ");
        for (int i = 0; i < dataSize; i++) System.out.print(dataSet[i] + " ");
        System.out.println();
    }

    static void computeStats() {
        if (dataSize == 0) { System.out.println("Array is empty."); return; }
        long total = 0; int hi = dataSet[0], lo = dataSet[0];
        for (int i = 0; i < dataSize; i++) {
            total += dataSet[i];
            if (dataSet[i] > hi) hi = dataSet[i];
            if (dataSet[i] < lo) lo = dataSet[i];
        }
        System.out.println("Sum     = " + total);
        System.out.printf("Average = %.2f%n", (double) total / dataSize);
        System.out.println("Largest = " + hi + "  |  Smallest = " + lo);
    }

    static void sortAscending() {
        for (int i = 0; i < dataSize - 1; i++)
            for (int j = 0; j < dataSize - i - 1; j++)
                if (dataSet[j] > dataSet[j + 1]) {
                    int tmp = dataSet[j]; dataSet[j] = dataSet[j + 1]; dataSet[j + 1] = tmp;
                }
        System.out.print("Sorted (asc): ");
        printArray();
    }

    static void reverseArray() {
        int lo = 0, hi = dataSize - 1;
        while (lo < hi) {
            int tmp = dataSet[lo]; dataSet[lo] = dataSet[hi]; dataSet[hi] = tmp;
            lo++; hi--;
        }
        System.out.print("Reversed: ");
        printArray();
    }

    static void searchElement(Scanner sc) {
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        for (int i = 0; i < dataSize; i++) {
            if (dataSet[i] == key) { System.out.println(key + " found at index " + i); return; }
        }
        System.out.println(key + " not found.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("\n=== Array Operations Menu ===");
            System.out.println("1.Load Array  2.Display  3.Statistics");
            System.out.println("4.Sort Asc    5.Reverse  6.Search  7.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1: loadArray(sc);      break;
                case 2: printArray();       break;
                case 3: computeStats();     break;
                case 4: sortAscending();    break;
                case 5: reverseArray();     break;
                case 6: searchElement(sc);  break;
                case 7: System.out.println("Exiting array menu."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (ch != 7);
        sc.close();
    }
}
