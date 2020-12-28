public class InsertValueInArray {



    public static int[] insertValueArr(int[] firstArr, int value, int index) {

        int[] newArr = new int[firstArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = firstArr[i];
            } else if (i == index) {
                newArr[i] = value;
                newArr[i + 1] = firstArr[i];
            }
        }
        return newArr;
    }

}
