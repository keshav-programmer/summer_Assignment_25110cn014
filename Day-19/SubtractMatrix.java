import java.util.Scanner;

public class SubtractMatrix {
    static void printMatrix(int[][] mat, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) System.out.printf("%5d", mat[i][j]);
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
        int[][] diff = new int[rows][cols];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matA[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matB[i][j] = sc.nextInt();

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) diff[i][j] = matA[i][j] - matB[i][j];

        System.out.println("A - B:");
        printMatrix(diff, rows, cols);
        sc.close();
    }
}
