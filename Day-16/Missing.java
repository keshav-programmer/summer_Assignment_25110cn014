import java.util.Scanner;

public class Missing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,7,8,9};
        int n = arr.length;

        int expectedTotal = n * (n + 1) / 2;
        int actualTotal = 0;
        for (int i = 0; i < n - 1; i++) actualTotal += arr[i];

        System.out.println("Missing number = " + (expectedTotal - actualTotal));;
    }
}
