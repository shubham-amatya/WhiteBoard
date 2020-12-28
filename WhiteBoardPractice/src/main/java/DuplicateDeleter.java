import java.util.Arrays;
import java.util.HashMap;

public class DuplicateDeleter {
    public static int[] duplicateDeleter(int[] array) {
        HashMap<Integer, Integer> countNumbers = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (countNumbers.containsKey(array[i])){
                countNumbers.put(array[i], countNumbers.get(array[i])+1);
            } else {
                countNumbers.put(array[i], 1);
            }
        }
        int[] result = new int[countNumbers.size()];
        int j =0;
        for (Integer i: countNumbers.keySet()) {
            result[j] = i;
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] array = {1, 1,7,9,7, 5, 3, 2, 3};
        int[] result = duplicateDeleter(array);
        System.out.println(Arrays.toString(result));
    }
}
