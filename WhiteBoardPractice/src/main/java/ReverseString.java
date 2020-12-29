public class ReverseString {

    public static String reverseString(String string){
        char [] charArr = string.toCharArray();

        String result = "";
            for(int j= charArr.length-1; j>=0; j--){
               result += charArr[j];
            }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        String string = "abcdefgh";
        reverseString(string);
    }

}
