import java.util.HashMap;
import java.util.Map;

//Method to find how many elements in the array have duplicates

public class CountDuplicatesInAnArray {


    public static int countDuplicates(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                map.put(array[i], map.get(array[i]) + 1);
            } else {
                map.put(array[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 1, 4};
        System.out.println(countDuplicates(array));
    }
}















