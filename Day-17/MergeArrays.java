import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int size1 = sc.nextInt();
        int[] first = new int[size1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < size1; i++) first[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int size2 = sc.nextInt();
        int[] second = new int[size2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < size2; i++) second[i] = sc.nextInt();

        int[] merged = new int[size1 + size2];
        for (int i = 0; i < size1; i++) merged[i] = first[i];
        for (int i = 0; i < size2; i++) merged[size1 + i] = second[i];

        System.out.print("Merged array: ");
        for (int val : merged) System.out.print(val + " ");
        System.out.println();
        sc.close();
    }
}
