import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 5, 2, 34, 1, 4, 2, 5, 1, 1, 6, 0, 8, 7, 5};
        int n = arr.length;

        System.out.print("Enter target sum: ");
        int targetSum = sc.nextInt();

        System.out.println("Pairs with sum " + targetSum + ":");
        boolean pairFound = false;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == targetSum) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    pairFound = true;
                }
            }
        }
        if (!pairFound) System.out.println("No pairs found.");

    }
}
