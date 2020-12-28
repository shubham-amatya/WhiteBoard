public class SumOfSubArrays {

    private static int sumOfSubArrays(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                }
            }
        }
        return sum;
    }


    private static int sumOfSubArrays2(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += (array[i] * (i + 1) * (array.length - i));
        }
        return sum;
    }

    private static int sumOfSubArrays3(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = i; j < array.length; j++) {
                temp += array[j];
                sum += temp;
            }
        }
        return sum;
    }
}
