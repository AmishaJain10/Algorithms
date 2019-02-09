import java.util.Arrays;

public class SelectionSort {

    public static void main(String args[]) {
        int arr[] = {92, 0,22,-2,29,2,2,4,49};
        int[] sortedarr = doSort(arr);
        System.out.println(Arrays.toString(sortedarr));


    }

    //  swap()
    static int[] doSort(int[] a) {
        int i, j, min_index = 0, temp;

        for (i = 0; i < a.length ; ++i) {
            System.out.println("Iteration Number: "+ i);
            min_index = i;
            for (j = i+1; j < a.length ; ++j) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                   }
            }
            if(min_index!=i) {
                temp = a[i];
                a[i] = a[min_index];
                a[min_index] = temp;
                System.out.println(Arrays.toString(a));
            }

         }
        return a;
    }


}
