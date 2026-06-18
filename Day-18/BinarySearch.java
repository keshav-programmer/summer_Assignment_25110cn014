import java.util.Scanner;

public class BinarySearch {
    static int BinarySearch(int[] arr, int low, int high, int key){
        if(low<=high){
            int mid = low + (high-low)/2;

            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key){
                BinarySearch(arr, mid +1,high,key);
            }else{
                BinarySearch(arr, low,mid -1,key);
            }
        }

        return -1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int key = sc.nextInt();
        int low = 0;
        int high = arr.length - 1;

       int ans =  BinarySearch(arr, low, high, key);

       if( ans >= 0){
           System.out.print("The key is : " + ans);
       }else{
           System.out.print("The element is not found");
       }

    }
}
