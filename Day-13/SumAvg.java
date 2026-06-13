public class SumAvg {
    public static void main(String[] args){
           int[] arr = {1,2,3,4,5};
           int len = arr.length;
           int sum = 0;
           for(int i = 0; i<len ; i++){
               sum += arr[i];
           }
           System.out.println("sum: "+ sum);
           System.out.print("avg: "+ sum/len);
    }
}
