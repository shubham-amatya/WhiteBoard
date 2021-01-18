public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        // Write your code here
        int numValleys = 0;
        int altitude = 0;

        for(int i=0; i<path.length(); i++){
            if (path.charAt(i)=='U'){
                if(altitude == -1){
                    numValleys++;
                }
                altitude++;
            }else if(path.charAt(i)=='D'){
                altitude--;
            }
        }

        return numValleys;
    }


    public static void main(String[] args) {
        int steps = 8;
        String path = "DDUUUUDD";
        System.out.println(countingValleys(steps, path));
    }

}

