import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args){
        int[] arr = {1,2,4,6,23,1,4,5,43,23,7};

        HashSet<Integer> set = new HashSet<>();

        for(int num: arr){
            if(!set.add(num)){
                System.out.println("Duplicate num: " + num);
            }
        }
    }
}
