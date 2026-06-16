public class MaxFreq {
    public static void main(String[] args){
        int[] arr = {1,2,5,2,34,1,4,2,5,1,1,6,0,8,7,5};
        int n = arr.length;
        int dominantElement = arr[0];
        int highestCount = 1;
        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) freq++;
            }
            if (freq > highestCount) {
                highestCount = freq;
                dominantElement = arr[i];
            }
        }
        System.out.println("Element with max frequency = " + dominantElement + " (appears " + highestCount + " times)");
    }
}
