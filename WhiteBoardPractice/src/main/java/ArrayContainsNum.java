public class ArrayContainsNum {
    public static boolean arrayContainsNum(int[] array, int Num){

        boolean containNum = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == Num){
                containNum = true;
                break;
            }else{
                containNum = false;
            }

        }
        return containNum;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int Num = 5;
        System.out.println(arrayContainsNum(array, Num));
    }
}
