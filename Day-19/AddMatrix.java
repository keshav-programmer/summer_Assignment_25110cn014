import java.util.Scanner;

public class AddMatrix {
    static void displayMatrix(int[][] mat, int rows, int cols) {
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) System.out.printf("%5d", mat[r][c]);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matA = new int[rows][cols];
        int[][] matB = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matA[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matB[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) result[i][j] = matA[i][j] + matB[i][j];

        System.out.println("Sum of matrices:");
        displayMatrix(result, rows, cols);
        sc.close();
    }
}
