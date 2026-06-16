import java.util.*;

public class RotateArrayRight {
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k %= n;

        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
    }
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length;
        System.out.println("Enter the number of index move to left");
        int k = sc.nextInt();

        rotate(arr,k);
        System.out.print(Arrays.toString(arr));
    }
}
