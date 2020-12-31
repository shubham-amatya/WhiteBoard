public class Recursion {

    public static int sumOfNumTillN(int N){

        if(N>0){
            return N+sumOfNumTillN(N-1);
        }else{
            return 0;
        }
    }


    public static void main(String[] args) {
        int N = 10;
        System.out.println(sumOfNumTillN(N));
    }



}
