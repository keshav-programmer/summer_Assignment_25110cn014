import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr = {2,3,5,1,6,7,9,45,23,47,13,25};
        int len = arr.length;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to Search: ");
        int key = sc.nextInt();
        boolean bool = false;
        int index = -1;
        for(int i = 0; i<len;i++){
            if(arr[i] == key){
                bool = true;
                index = i;
                break;
            }
        }

        if(bool){
            System.out.print("The index of number is :" + index);
        }else{
            System.out.print("The number not found");
        }
    }
}
