import java.util.Scanner;

public class CommonElements {

    static boolean presentIn(int[] arr, int len, int val) {
        for (int i = 0; i < len; i++) if (arr[i] == val) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array 1: ");
        int m = sc.nextInt();
        int[] a = new int[m];
        System.out.println("Enter array 1:");
        for (int i = 0; i < m; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of array 2: ");
        int n = sc.nextInt();
        int[] b = new int[n];
        System.out.println("Enter array 2:");
        for (int i = 0; i < n; i++) b[i] = sc.nextInt();

        System.out.print("Enter size of array 3: ");
        int p = sc.nextInt();
        int[] c = new int[p];
        System.out.println("Enter array 3:");
        for (int i = 0; i < p; i++) c[i] = sc.nextInt();

        System.out.print("Common elements in all three arrays: ");
        boolean found = false;
        for (int i = 0; i < m; i++) {
            if (presentIn(b, n, a[i]) && presentIn(c, p, a[i])) {
                System.out.print(a[i] + " ");
                found = true;
            }
        }
        if (!found) System.out.print("None");
        System.out.println();
        sc.close();
    }
}
