import java.util.Scanner;

public class UnionOfArrays {
    static boolean existsIn(int[] arr, int size, int val) {
        for (int i = 0; i < size; i++) if (arr[i] == val) return true;
        return false;
    }

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

        int[] unionArr = new int[m + n];
        int unionSize = 0;
        for (int i = 0; i < m; i++) {
            if (!existsIn(unionArr, unionSize, a[i])) unionArr[unionSize++] = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (!existsIn(unionArr, unionSize, b[i])) unionArr[unionSize++] = b[i];
        }
        System.out.print("Union: ");
        for (int i = 0; i < unionSize; i++) System.out.print(unionArr[i] + " ");
        System.out.println();
        sc.close();
    }
}
