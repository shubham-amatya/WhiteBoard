public class CountEvenNumbers {
    public static int countOfEvenNumbers() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
