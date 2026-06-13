public class EvenOdd {
    public static void main(String[] args){
            int[] arr = {23,54,3,54,23,56,314,43,23,65,23};
            int len = arr.length;
            int even = 0;
            int odd = 0;

            for(int i = 0;i<len;i++){
                if(arr[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
            }
            System.out.println("even: " + even);
            System.out.print("odd: " + odd);
    }
}
