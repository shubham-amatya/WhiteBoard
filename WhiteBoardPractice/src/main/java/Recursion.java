public class Recursion {

    //Recursion is the technique of making a function call itself.
    // This technique provides a way to break complicated problems down
    // into simple problems which are easier to solve.
    //Just as loops can run into the problem of infinite looping,
    // recursive functions can run into the problem of infinite recursion.
    // Infinite recursion is when the function never stops calling itself.
    // Every recursive function should have a halting condition

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
