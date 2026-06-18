public class SelectionSort {


    static int[] SelectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {2,5,2,5,67,34,231,45,34,45,23};
        int n = arr.length;
        int[] sortArr = SelectionSort(arr,n);

        for(int i = 0;i<n;i++){
            System.out.print(sortArr[i] + ",");
        }
    }
}
