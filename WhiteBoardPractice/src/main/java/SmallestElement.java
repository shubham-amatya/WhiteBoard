public class SmallestElement {

    public static int findSmallestElement(int []arr){
        int smallestElement = arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<arr[i+1]){
                    smallestElement= arr[i];
            }else{
                smallestElement=arr[i+1];
            }

        } return smallestElement;
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 9, 6};
        System.out.println(findSmallestElement(arr));
    }
}
