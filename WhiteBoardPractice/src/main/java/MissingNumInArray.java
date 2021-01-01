public class MissingNumInArray {

    public static int findMissingNumberinArray(int [] array, int N){
        int sumWithoutMissingNum = findSum(N);
        int missingNum;
        int actualSum =0;
        for (int i = 0; i <= array.length-1; i++) {
            actualSum += array[i];

        }
        missingNum = sumWithoutMissingNum - actualSum;
        return missingNum;
    }


    //helper method to find the sum from 0-N
    public static int findSum(int N){
        if(N>0){
            return N+(findSum(N-1));
        } else{
            return 0;
        }
    }

    public static void main(String[] args) {
       int[] array = {1, 2, 3, 4, 5, 6, 7, 9}; //expected output 8
        System.out.println(findMissingNumberinArray(array, 9));
    }
}


