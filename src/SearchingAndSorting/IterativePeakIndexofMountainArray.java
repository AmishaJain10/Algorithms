public class IterativePeakIndexofMountainArray {


    public static void main(String args[]) {
        int[] a = {2, 4, 7, 8, 9, 65, 4, 3, 2, 1};
        int peak = returnPeak(a);
        System.out.println(peak);

    }

    // complexity os Big O since for loop is used for linear traversal
    public static int returnPeak(int[] a) {

        int peak=-1;
        for (int i = 1; i < a.length; i++) {
            if((a[i ] > a[i-1])){
             peak++;
            }
            else
                return peak+1;
        }
        return 0;
    }


}
