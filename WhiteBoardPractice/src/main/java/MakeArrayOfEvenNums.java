import java.util.Arrays;

public class MakeArrayOfEvenNums {
    public static int[] makeEvensArr() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        int[] answerArr = new int[count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                answerArr[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(answerArr));
        return answerArr;
    }
}
