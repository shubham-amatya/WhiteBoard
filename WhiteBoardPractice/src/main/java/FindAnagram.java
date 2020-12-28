public class FindAnagram {
    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

//        Arrays.sort(charArr1);
//        Arrays.sort(charArr2);


        sortAlphabets(charArr1);
        sortAlphabets(charArr2);


        for (int i = 0; i < charArr1.length; i++) {

            if (charArr1[i] != charArr2[i]) {
                return false;
            }
        }

        return true;
    }

    private static void sortAlphabets(char[] charArr1) {
        char temp;
        for (int i = 0; i < charArr1.length - 1; i++) {
            for (int j = i + 1; j < charArr1.length; j++) {
                if (charArr1[i] > charArr1[j]) {
                    temp = charArr1[i];
                    charArr1[i] = charArr1[j];
                    charArr1[j] = temp;
                }
            }
        }
    }
}
