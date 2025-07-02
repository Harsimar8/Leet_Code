class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        int n = matrix.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] =  matrix[i][n-j-1]; 
                matrix[i][n-j-1] = temp;
            }
        }
        
    }
    public void transpose(int[][] arr){
        int n = arr.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }
}