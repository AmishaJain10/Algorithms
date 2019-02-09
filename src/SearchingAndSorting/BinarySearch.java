package SearchingAndSorting;

public class BinarySearch {

    public static void main(String args[]) {
        int a[] ={-1, 7, 13,14,17,19, 45, 56, 99};
        int num = 5;
        int index = binarySearch(a, num);

         System.out.println("Given number is at "+index+ " position");
    }

    public static int binarySearch(int[] a,int n){

        int low=0, high=a.length-1,mid=0;

        while(low<high) {

            mid = (low + high) / 2;

            if (a[mid] == n) {
                return mid;
            } else if (n > a[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
