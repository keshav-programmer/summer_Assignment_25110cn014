public class DuplicateRemove {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,34,1,4,2,5,1,1,6,0,8,7,5};
        int n = arr.length;
        int[] uniqueArr = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean seenBefore = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueArr[j] == arr[i]) { seenBefore = true; break; }
            }
            if (!seenBefore) uniqueArr[uniqueCount++] = arr[i];
        }

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) System.out.print(uniqueArr[i] + " ");
        System.out.println();
    }
}
