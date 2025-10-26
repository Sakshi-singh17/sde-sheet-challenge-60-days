package day1;

public class Set_Matrix_Zeroes_2 {
    public void setZeroes(int[][] matrix) {
        int col0 = 1;
        int m = matrix.length;
        int n = matrix[0].length;

        //marking 0
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }

        //marking 0 from 2nd row and 2nd col to last
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0 || matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }

        //marking 1st row and 1st col as 0
        if(matrix[0][0]==0){
            for(int j=0; j<n; j++){
                matrix[0][j]=0;
            }
        }

        if(col0==0){
            for(int i=0; i<m; i++){
                matrix[i][0]=0;
            }
        }
    }
}
