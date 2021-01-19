public class SmallestNum {

    public static int findSmallestNum(int[] numbers){
        int result = numbers[0];
        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i]>numbers[i+1]){
                result = numbers[i+1];
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] num = {2, 6, 9, 2, 3, 15};
        System.out.println(findSmallestNum(num));
    }
}
