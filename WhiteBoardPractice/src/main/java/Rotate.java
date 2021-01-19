import java.util.ArrayList;
import java.util.Arrays;

public class Rotate {
    public static int[] rotate(int[] arr, int index) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[(i + index + arr.length) % arr.length];
        }
        return result;
    }

    public static void main(String[] args) {
        int index1 = 3;
        int[] arr2 = {5, 1, 8, 4, 2};
        System.out.println(Arrays.toString(rotate3(arr2, index1)));
    }


    public static int[] rotate1(int[] arr, int index) {
        int[] result = new int[arr.length];
        ArrayList<Integer> changed = new ArrayList<>();

//        String str = "";
//        for (int i = 0; i <arr.length ; i++) {
//            str += arr[i];
//    }
        for (int i = index; i < arr.length; i++) {
            changed.add(arr[i]);
        }
        for (int i = 0; i < index; i++) {
            changed.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            result[i] = changed.get(i);
        }

        return result;

        }


        public static int[] rotate3 (int[] arr, int index){
        int[] result = new int[arr.length];
        int j = 0;
        int holder;
            for (int i = index; i <arr.length ; i++) {
                result[j] = arr[i];
                j++;
            }
            holder = j;
            for (int i = 0; holder<arr.length ; i++) {
                result[holder] = arr[i];
                holder++;
            }
            return result;
        }

}
