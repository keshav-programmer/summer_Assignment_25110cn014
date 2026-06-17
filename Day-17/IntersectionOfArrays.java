import java.util.Scanner;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter first array:");
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter second array:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        System.out.print("Intersection: ");
        boolean anyCommon = false;
        int[] printed = new int[m];
        int printedCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    boolean duplicate = false;
                    for (int k = 0; k < printedCount; k++) {
                        if (printed[k] == a[i]) { duplicate = true; break; }
                    }
                    if (!duplicate) {
                        System.out.print(a[i] + " ");
                        printed[printedCount++] = a[i];
                        anyCommon = true;
                    }
                }
            }
        }
        if (!anyCommon) System.out.print("None");
        System.out.println();
        sc.close();
    }
}
