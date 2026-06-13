import java.util.Arrays;

public class LargestSmallest {
    public static void main(String[] args) {
        int[] arr = {2,53,2,35,23,65,12};
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println("Largest: " + arr[0]);
        System.out.print("Minimum: " + arr[len-1]);


    }
}
