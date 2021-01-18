public class FibonacciNumbers {

    public static void PrintFibonacci(int N){
        int firstNum = 0, secondNum = 1;
        int counter = 0;

        //Iterate till counter is N
        while(counter < N){
            System.out.print(firstNum + " ");

            //Swap
            int thirdNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = thirdNum;
            counter = counter +1;
        }
    }

    public static void main(String[] args) {
        int N = 10;
        PrintFibonacci(N);
    }



}
