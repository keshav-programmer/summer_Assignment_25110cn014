import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first sorted array: ");
        int m = sc.nextInt();
        int[] arrA = new int[m];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < m; i++) arrA[i] = sc.nextInt();

        System.out.print("Enter size of second sorted array: ");
        int n = sc.nextInt();
        int[] arrB = new int[n];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < n; i++) arrB[i] = sc.nextInt();

        int[] sortedMerge = new int[m + n];
        int pA = 0, pB = 0, pC = 0;
        while (pA < m && pB < n) {
            if (arrA[pA] <= arrB[pB]) sortedMerge[pC++] = arrA[pA++];
            else sortedMerge[pC++] = arrB[pB++];
        }
        while (pA < m) sortedMerge[pC++] = arrA[pA++];
        while (pB < n) sortedMerge[pC++] = arrB[pB++];

        System.out.print("Merged sorted array: ");
        for (int val : sortedMerge) System.out.print(val + " ");
        System.out.println();
        sc.close();
    }
}
