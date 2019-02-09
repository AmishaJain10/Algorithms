package Matrix;

public class FindNumberIndexinMAtrix {
    public static void main(String args[]){
        int[][] matrix={{2,3,4},{1,9,5}};
        int num=4;
        //int[][] index=
                getIndex(matrix,num);
    }

    static void getIndex(int[][] matrix,int num){
        for(int i=0;i<matrix.length;++i){
            for(int j=0;j<matrix[i].length;++j){
                if(matrix[i][j]==num)
                    System.out.println("Index is :{"+i+ ","+j+"}") ;
            }

        }
    }
}
