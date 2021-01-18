import java.util.HashMap;
import java.util.Map;

public class CountingSocks {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int countPairs =0;
        for(int i=0; i<ar.length; i++){
            if(map.containsKey(ar[i])){
                map.put(ar[i], map.get(ar[i])+1);
            }else{
                map.put(ar[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            countPairs += entry.getValue()/2   ;
        }

//        for(int i=0; i<map.size(); i++){
//            countPairs += map.get
//        }
        return countPairs;
    }


    public static void main(String[] args) {
        int n= 9;
       int[] ar = {10,20, 20, 10 ,10 ,30 ,50, 10 ,20};
        System.out.println(sockMerchant(n, ar));

    }


}
