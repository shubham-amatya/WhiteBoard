public class ConvertToStringAndAddElementInArray {

    //Given String[] of integers {“-2”, “6”, “9”, “-5”, “5”, “-3”}
    //Give back sum of +ve nos. n negative nos. as an int[];  {-10, 20}
    public static int[] convertToIntAndAdd(String[] array) {
        int[] arrayAsInt = new int[array.length];
        int[] result = new int[2];
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < array.length; i++) {
            arrayAsInt[i] = Integer.parseInt(array[i]);
        }


        for (int j = 0; j < array.length; j++) {
            if (arrayAsInt[j] <= 0) {
                negativeCount += arrayAsInt[j];
            } else {
                positiveCount += arrayAsInt[j];

            }
        }
        result[0] = negativeCount;
        result[1] = positiveCount;

        return result;

    }

}
