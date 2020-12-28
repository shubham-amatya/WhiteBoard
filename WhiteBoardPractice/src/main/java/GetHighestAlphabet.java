public class GetHighestAlphabet {
    private static char getHighestAlphabet(String string) {

        char[] arrOfChar = string.toCharArray();
        char max = arrOfChar[0];
        for (int i = 0; i < arrOfChar.length; i++) {
            if (arrOfChar[i] > max) {
                max = arrOfChar[i];
            }
        }
        return max;
    }

}
