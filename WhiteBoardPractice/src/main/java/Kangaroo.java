public class Kangaroo {

    public static int countHops(int start2, int rate2) {
        int start1 = 1;
        int rate1 = 2;
        int numOfJumps = 0;

        if (start2 > start1 && rate2 >= rate1) {
            return -1;
        }
            while (start2 > start1) {
                start1 += rate1 ;
                start2 += rate2;
                numOfJumps++;
            }
   return numOfJumps;
    }

    public static void main(String[] args) {
        int start2 = 2;
        int rate2 = 2;
        System.out.println(countHops(start2, rate2));
    }

}
