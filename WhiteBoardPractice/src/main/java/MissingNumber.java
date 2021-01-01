public class MissingNumber {

    // How to find the missing number in integer array of 1 to 100?

    public static int findMissingNumberfrom0toN(int N){
        int sumWithoutMissingNum = findSum(N);
        int missingNum;
        int actualSum =0;
        for (int i = 0; i <= N; i++) {
            actualSum += i;

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
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 9};
        System.out.println(findMissingNumberfrom0toN(9));
    }
}
