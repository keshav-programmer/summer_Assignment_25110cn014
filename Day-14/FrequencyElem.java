import java.util.HashMap;

public class FrequencyElem {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,2,4,5,3,2,2,6,7};
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.print(map);
    }
}
