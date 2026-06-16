import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args){
        int[] arr = {0,1,0,2,3,0,4,0,5,6,7};
        int ind = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[ind] = arr[i];
                ind++;
            }
        }
        while(ind<arr.length){
            arr[ind] = 0;
            ind++;
        }
        System.out.print(Arrays.toString(arr));
    }
}
