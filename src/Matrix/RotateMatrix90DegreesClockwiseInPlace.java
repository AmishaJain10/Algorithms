package Matrix;

/*You are given an n x n 2D matrix representing an image. Rotate the image by 90
        degrees (clockwise).
        For example: given input matrix = [ [1,2,3],
        [4,5,6],
        [7,8,9] ],
        rotate the input matrix in-place such that it becomes: [ [7,4,1],
        [8,5,2],
        [9,6,3] ] */

public class RotateMatrix90DegreesClockwise {
    public static void main(String args[]) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // matrix1[row][column] It is an array of array
        rotateMatrix(matrix1); // rotate matrix1 by 90 degree clockwise
    }

    static void rotateMatrix(int[][] matrix1){
        for(int i=0;i<matrix1.length;i++){
            for(int j=0;j<matrix1[i].length;j++){
                int temp;
                matrix1[i][j]=matrix1[i+matrix1[i].length-1][matrix1[i].length-i];
                System.out.println(matrix1[i][j]);
            }
        }

    }
}


