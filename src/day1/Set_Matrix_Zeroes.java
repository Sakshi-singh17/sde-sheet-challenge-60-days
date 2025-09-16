//73. Set Matrix Zeroes

package day1;

import java.util.ArrayList;

public class Set_Matrix_Zeroes {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer>col = new ArrayList<>();
        // int[]row = new int[r];
        // int[]col = new int[c];

        //marking rows and cols of 0
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }


    }
}
