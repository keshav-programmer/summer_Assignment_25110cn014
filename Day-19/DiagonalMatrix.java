import java.util.Scanner;

public class DiagonalMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix (N x N): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) matrix[i][j] = sc.nextInt();

        int primaryDiagSum = 0, secondaryDiagSum = 0;
        for (int i = 0; i < n; i++) {
            primaryDiagSum   += matrix[i][i];
            secondaryDiagSum += matrix[i][n - 1 - i];
        }
        System.out.println("Primary diagonal sum   = " + primaryDiagSum);
        System.out.println("Secondary diagonal sum = " + secondaryDiagSum);
        sc.close();
    }
}
