package SearchingAndSorting;

import java.util.Arrays;

public class PairSumEqualsRestSum {

    public static void main(String args[]) {
        int[] arr = {9,4,4,1,2};
        int sum = getArraySum(arr)/2;

        int[] pair=pairSumEqualsGivenNumber(arr,sum);
        if(pair!=null)
            System.out.println("those two numbers are: " + Arrays.toString(pair));
        else
            System.out.println("No pair exists");

    }

    static int getArraySum(int a[]) {
        int sum = 0;
        for (int num : a) {
            sum = sum + num;
        }
        return sum;
    }


    static int[] pairSumEqualsGivenNumber(int[] arr, int sum) {
        selectionSort(arr);
        int[] output= new int[2];
        //  System.out.println("array is " +ArrayAlgos.toString(a));
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] + arr[right] == sum) {
                //  System.out.println("Pair is: " + a[left] + " " + a[right]);
                output[0]=arr[left];
                output[1]=arr[right];
                return output;
            } else if (arr[left] + arr[right] > sum)
                right--;
            else left++;
        }
        return null;
    }

    static void  selectionSort(int[] a) {
        int i, j, min_index = 0, temp;

        for (i = 0; i < a.length; ++i) {
            // System.out.println("Iteration Number: " + i);
            min_index = i;
            for (j = i + 1; j < a.length; ++j) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }
            if (min_index != i) {
                temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
                // System.out.println(ArrayAlgos.toString(a));
            }
        }
    }
}
