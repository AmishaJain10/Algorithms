package SearchingAndSorting;

import java.util.Arrays;

public class BubbleSort {


    // for(int i=0;i< 5;i++)

    static int[] doSort(int[] a) {

//        static void BubbleSort(int[] arr)
//        {
//            for (int i = 0; i < arr.Length; i++)
//            {
//                for (int j = 0; j < arr.Length - i - 1; j++)
//                {
//                    if (arr[j] > arr[j + 1])
//                    {
//                        Swap(arr, j, j + 1);
//                    }
//                }
//            }
//        }
        for (int j = 1; j <= a.length; j++) {
            boolean isSwapped = false;
            int temp = 0;
            for (int i = 0; i < a.length -j; i++) {

                if (a[i] > a[i + 1]) {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }

           // System.out.println(ArrayAlgos.toString(a));
        }
        return a;
    }

    public static void main(String args[]) {

        int[] array = {2, 7, 1, 5, 6, 0};
        int[] b = doSort(array);
        System.out.println(Arrays.toString(b));

    }


}


