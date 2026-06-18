public class BubbleSort {
     static int[] BubbleSort(int[] arr, int n){
        for(int i = n-1;i>=0;i--){
            for(int j = 0;j<=i-1;j++){
                if(arr[j+1] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2,5,2,5,67,34,231,45,34,45,23};
        int n = arr.length;
        int[] sortArr = BubbleSort(arr,n);

        for(int i = 0;i<n;i++){
            System.out.print(sortArr[i] + ",");
        }
    }
}
