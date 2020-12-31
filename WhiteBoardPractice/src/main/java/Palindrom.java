public class Palindrom {

    public static boolean isPalindromic(String string){
        boolean verdict = false;
        String result = "";
        for(int i=string.length()-1; i>=0; i--){
            result += string.charAt(i);
        }

        if(string.equals(result)){
            verdict = true;
        }else{
            verdict = false;
        }
//        for (int i = 0; i < string.length(); i++) {
//            if(string.charAt(i) == result.charAt(i)){
//               verdict= true;
//            } else{
//                verdict = false;
//                break;
//            }
//        }
         return verdict;
    }

    public static void main(String[] args) {
        String string = "loool";
        System.out.println(isPalindromic(string));
    }


}
