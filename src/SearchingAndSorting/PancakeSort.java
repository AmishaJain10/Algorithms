import java.util.Arrays;

public class PancakeSort {

    public static void main(String args[])
    {
        int[] array= {90,4-2,0,-5,3,5,9};
        pancakeSorting(array);
        System.out.println(Arrays.toString(array));
    }

    static void pancakeSorting(int[] array) {
        for (int partition = array.length - 1; partition >= 0; partition--) {
            int maxIndex = findMaxIndex(array, partition);

            if (maxIndex != partition) {
                flip(array, maxIndex);

                flip(array, partition);
            }
        }
    }

    static int findMaxIndex ( int[] array, int lastIndex)
    {
        int maxIndex = 0;
        for (int i = 0; i <= lastIndex; i++) {
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        return maxIndex;
    }

    static void flip ( int[] arr, int i)
    {
        int temp, start = 0;
        while (start < i) {
            temp = arr[start];
            arr[start] = arr[i];
            arr[i] = temp;
            start++;
            i--;
        }
    }
}

