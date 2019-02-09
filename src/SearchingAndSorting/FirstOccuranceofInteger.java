public class FirstOccuranceofInteger {

    public static void main(String args[]) {
        int[] arr = {1, 1,1,1,2,2,2,1,1,1};
        int k = 2;
        // int z = findFirstIndex(arr, k);
        //  int z = binarySearchRecursive(arr,0,arr.length,k);
        int z=binarySearchIteration(arr,k);
        if (z > 0)
            System.out.println("The first occurance of " + k + " is at position "+z+" in the given array");
        else
            System.out.println("Nummber does not exist in array");

    }

    static int findFirstIndex(int[] ar, int k) {
        for (int i = 1; i < ar.length; ++i) {
            if (ar[i] == k)
                return i + 1;
        }
        return -1;
    }
    static int binarySearchRecursive(int[] arr,int start,int end,int value)
    {
        if(start<end){
            int mid=(start+end)/2;
            if(arr[mid]==value){
                return mid;
            }else if(arr[mid]>value){
                return binarySearchRecursive(arr,start,mid,value);
            }else{
                return binarySearchRecursive(arr,mid,end,value);
            }

        }
        return -1;
    }

    static int binarySearchIteration(int[] arr,int value) {
        int start=0,end=arr.length,mid=0;
        while(start<end){
            mid=(start+end)/2;
            if(arr[mid]==value){
                while (mid>-1 && arr[mid]==value){
                    --mid;
                }
                return mid+2;
            }else if(arr[mid]>value){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}

