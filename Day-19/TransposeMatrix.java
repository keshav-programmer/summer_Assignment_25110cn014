import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] original = new int[rows][cols];
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) original[i][j] = sc.nextInt();

        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) transposed[j][i] = original[i][j];

        System.out.println("Transposed matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) System.out.printf("%5d", transposed[i][j]);
            System.out.println();
        }
        sc.close();
    }
}
