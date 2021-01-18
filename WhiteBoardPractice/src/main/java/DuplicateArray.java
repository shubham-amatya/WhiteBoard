import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {

    public static int[] arrayOfDuplicates(int[] array){

        HashMap<Integer, Integer> map = new HashMap<>();
        int count =0;

        for (int i = 0; i <array.length ; i++) {
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue()>1){
                count++;
            }
        }

        int[] result = new int[count];

        int i=0;
        for(Map.Entry<Integer, Integer> e: map.entrySet()){
            if(e.getValue()>1){
                result[i] = e.getKey();
                i++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
       int[] array =  {2, 1, 2, 3, 2, 4, 5, 4};
        System.out.println(Arrays.toString(arrayOfDuplicates(array)));
    }

}
