import java.util.Scanner;

public class SymmetricMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) mat[i][j] = sc.nextInt();

        boolean isSymmetric = true;
        outerLoop:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                    break outerLoop;
                }
            }
        }
        System.out.println("The matrix is " + (isSymmetric ? "Symmetric." : "NOT Symmetric."));
        sc.close();
    }
}
