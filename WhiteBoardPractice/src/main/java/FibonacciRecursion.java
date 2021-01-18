public class FibonacciRecursion {

    public static int fibPrint(int N){
        if(N<=1){
            return N;
        }
        return fibPrint(N-1)+ (N-2);
    }

    public static void main(String[] args) {
        int N = 10;
        for(int i= 0; i< N; i++){
            System.out.print(fibPrint(i)+ " ");
        }
    }


}
