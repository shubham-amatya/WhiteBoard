public class SortArray {

    public static int[] sortGivenArray() {
        int[] a = {5, 1, 3, 7, 8, 4};
        int temp;
        //int[] sortedArr = new int[a.length];

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[i + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.print(i + ", ");
        }
        return a;
    }
}
