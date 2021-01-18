public class LongestWord {

    public static String findLongestWord(String sentence){

        String [] listOfWords = sentence.split(" ");
        String longestWord = listOfWords[0];

        for (int i=0; i< listOfWords.length-1; i++ ){
            if(listOfWords[i].length() < listOfWords[i+1].length()){
                longestWord = listOfWords[i+1];
            }
        }
        return longestWord;
    }


    public static void main(String[] args) {
        String sentence = "I love ZipCode";
        System.out.println(findLongestWord(sentence));
    }
}
