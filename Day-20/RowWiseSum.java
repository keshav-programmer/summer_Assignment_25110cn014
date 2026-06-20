import java.util.Scanner;

public class RowWiseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter columns: ");
        int cols = sc.nextInt();
        int[][] mat = new int[rows][cols];
        System.out.println("Enter matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) mat[i][j] = sc.nextInt();

        System.out.println("Row-wise sums:");
        for (int i = 0; i < rows; i++) {
            int rowTotal = 0;
            for (int j = 0; j < cols; j++) rowTotal += mat[i][j];
            System.out.println("Row " + (i + 1) + " sum = " + rowTotal);
        }
        sc.close();
    }
}
