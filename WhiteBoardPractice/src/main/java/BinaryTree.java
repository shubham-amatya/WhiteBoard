import org.w3c.dom.ls.LSOutput;

public class BinaryTree {
    /*

     Given a number n, print the numbers in a pyramid format.. eg. n =10


            1

            2 3

            4 5 6

            7 8 9 10,  and so on.*/



    public static void printTree(int N) {

        int number = 1;


            for (int i = 1; number<=N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println("\n");
            }
    }

    public static void main(String[] args) {
        int N = 10;
        printTree(N);
    }
}
