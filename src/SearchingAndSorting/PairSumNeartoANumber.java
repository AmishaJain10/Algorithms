package SearchingAndSorting;

import java.util.Arrays;

public class PairSumNeartoANumber {

    public static void main(String args[]) {
        int[] arr = {4, 2, 13, 8, 9, 1, 10};
        int givenNumber = 7;
        int[] result = findPair(arr, givenNumber);
        if (result != null)
            System.out.println("There exists a pair:" + Arrays.toString(result));
        else
            System.out.println("There exists no pair");
    }


    static int[] findPair(int[] arr, int givenNumber) {
        sort(arr);
        int left = 0, right = arr.length - 1, minDistance = givenNumber;
        int[] output = new int[2];
        while (left < right) {
            int curSum = arr[left] + arr[right];
            if (minDistance > Math.abs(givenNumber - curSum)) {
                minDistance = Math.abs(givenNumber - curSum);
                output[0] = arr[left];
                output[1] = arr[right];
            }

            if (arr[left] + arr[right] > givenNumber) {
                --right;
            } else {
                left++;
            }
        }
        return output;
    }

    static void sort(int[] a) {
        for (int j = 1; j <= a.length; j++) {
            boolean isSwapped = false;
            int temp = 0;
            for (int i = 0; i < a.length - j; i++) {

                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

}