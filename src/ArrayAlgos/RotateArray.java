package ArrayAlgos;


/*Rotate array by no of times mentioned
 * Eg: Rotate array {1,2,3,4,5} by 3 times..
  * Answer: {2,3,4,5,1}..{3,4,5,1,2},{4,5,1,2,3}*/

public class RotateArray {
public static void main(String args[]){
     int[] arr={1,2,3,4,5};
     int noOfRotations=0;
     reverse(arr,noOfRotations);

}

 static void reverse(int[] arr,int noOfRotations){

    for(int i=0;i<noOfRotations;i++){
        for(int j=0;j<arr.length;j++){
            if(i==0){
                swap(arr[j],arr[arr.length-1]);
            }
            swap(arr[j],arr[j-1]);
        }

    }
    System.out.println("Reverse array is: ");
     for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+ ",");
     }
 }

 static void swap(int a,int b){
    int temp=0;
    temp=a;
    a=b;
    b=temp;
 }
}
