import java.util.Arrays;

public class FindkthLargest
{
    public static void main(String args[]) {
        int[] arr = {4, 2, 0,3, 8, 9, 1, -5};
        int k = 3;
        int x = findKthLargest(arr, k);
        System.out.println(+k+ "th largest element is:"+x);
    }

    static int findKthLargest(int[] arr1, int k) {
        int i, j, max_index = 0, temp;
        for (i = arr1.length-1; i>arr1.length-k-1 ; --i)
        {
            max_index = i;
            for (j = i-1; j >= 0 ; --j) {
                if (arr1[j] > arr1[max_index]) {
                    max_index = j;
                }
            }
            if(max_index!=i) {
                swap(arr1,i,max_index);
            }
        }
        return arr1[i+1];
    }

    static void swap(int[] arr2,int i,int j)
    {
        int temp = arr2[i];
        arr2[i] = arr2[j];
        arr2[j] = temp;
        System.out.println(Arrays.toString(arr2));

    }

}