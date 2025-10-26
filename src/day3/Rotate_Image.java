package day2;
//48. Rotate Image
public class Rotate_Image {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //find transpose of matrix
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                swap(matrix, i, j);
            }
        }

        //reverse rows
        for(int i=0; i<n; i++){
            reverse(matrix[i]);
        }
    }

    public void swap(int matrix[][], int i, int j){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }

    public void reverse(int[]row){
        int start=0;
        int end=row.length-1;
        while(start<end){
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }
}
