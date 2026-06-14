import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args){
        int[] arr = {1,4,2,5,6,4,56,23,36,23,73,134,65,};
        Arrays.sort(arr);
        System.out.print(arr[arr.length - 2]);
    }
}
