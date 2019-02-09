/*using Binary Search to find highest peak in pattern:
2. Peak Index in a mountain array
        Given an array, return any i (index) such that A[0] < A[1] < ... A[i - 1] < A[i] > A[i + 1] > ... > A[A.length - 1]
        Ex: Input : [0,2,1,0]
        Output : 1 */

public class PeakIndexofMountainArrayUsingBS {

    public static void main(String args[]) {

        int[] a = {-1, 3, 4, 7, 13, 14, 17, 19, 45, 56, 99, 109, 9, 7, 5, -4, -22};
        int[] b={9, 7, 5, -4, -22,-1, 3, 4, 7, 13, 14, 17, 19, 45, 56, 99, 109};
        int peak = doBinarysearchMountain(a);
        int low = doBinarysearchValley(b);
        System.out.println(a[peak]);
        System.out.println(b[low]);
    }


    public static int doBinarysearchMountain(int[] a) {
        int low = 0, high = a.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] > a[mid - 1] && a[mid] > a[mid + 1]) {
                return mid;
            } else if (a[mid] < a[mid + 1]) {
                low = mid + 1;
            } else if (a[mid] > a[mid + 1])
                high = mid - 1;

        }
        return -1;
    }



    public static int doBinarysearchValley(int[] a) {
        int low = 0, high = a.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;

            if (a[mid] < a[mid - 1] && a[mid] < a[mid + 1]) {
                return mid;
            } else if (a[mid] > a[mid + 1]) {
                low = mid + 1;
            } else if (a[mid] < a[mid + 1])
                high = mid - 1;

        }
        return -1;
    }

}







