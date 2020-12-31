import java.util.HashMap;
import java.util.Map;

public class MostCommonElement {

    public static int findMostCommonElement(int[] array){

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if(!hashmap.containsKey(array[i])){
                hashmap.put(array[i], 1);
            }else{
                hashmap.put(array[i], hashmap.get(array[i])+1);
            }
        }
        int max =1;
       for(Map.Entry<Integer, Integer> map : hashmap.entrySet()){
           if(map.getValue()>max){
               max = map.getKey();
           }
        }
        System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        int [] array = {4,2,2,3,5,2};
        findMostCommonElement(array);
    }

}
