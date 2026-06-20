import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows of A: ");    int rowA = sc.nextInt();
        System.out.print("Cols of A / Rows of B: "); int colA = sc.nextInt();
        System.out.print("Cols of B: ");    int colB = sc.nextInt();

        int[][] matA = new int[rowA][colA];
        int[][] matB = new int[colA][colB];
        int[][] product = new int[rowA][colB];

        System.out.println("Enter matrix A:");
        for (int i = 0; i < rowA; i++)
            for (int j = 0; j < colA; j++) matA[i][j] = sc.nextInt();

        System.out.println("Enter matrix B:");
        for (int i = 0; i < colA; i++)
            for (int j = 0; j < colB; j++) matB[i][j] = sc.nextInt();

        for (int i = 0; i < rowA; i++)
            for (int j = 0; j < colB; j++)
                for (int k = 0; k < colA; k++)
                    product[i][j] += matA[i][k] * matB[k][j];

        System.out.println("Product matrix A x B:");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < colB; j++) System.out.printf("%6d", product[i][j]);
            System.out.println();
        }
        sc.close();
    }
}
