public class BinarySearch {

    public static void main(String[] args) {
        int[] array = {2, 3, 4, 7, 9};
        int x = 5;
        if (binarySearch(array, x) == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(binarySearch(array, x));
        }
    }


    public static int binarySearch(int[] array, int x){
        int start  = 0;
        int end = array.length-1;
        while(start<end) {
            int mid = (start + end) / 2;
            if(mid == x){
                return mid;
            }else if(x>mid){
                start = mid +1;
            }else if(x<mid){
                end = mid -1;
            }
        }
        return -1;
    }

}
