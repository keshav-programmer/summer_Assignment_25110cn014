import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0;i<N;i++){
            System.out.print(arr[i] + ",");
        }
    }
}
