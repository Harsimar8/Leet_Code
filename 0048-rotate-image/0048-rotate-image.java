class Solution {
    public void rotate(int[][] matrix) {
        int[][] transposed = transpose(matrix); 
        int n = transposed.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<n/2; j++){
                int temp = transposed[i][j];
                transposed[i][j] =  transposed[i][n-j-1]; 
                transposed[i][n-j-1] = temp;
            }
        }
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                matrix[i][j] = transposed[i][j];
            }
        }
    }
    public int[][] transpose(int[][] arr){
        int r= arr.length;
        int c = arr[0].length;
        int[][] naa = new int[c][r];
        for(int i =0; i<c; i++){
            for(int j =0; j<r; j++){
                naa[i][j] = arr[j][i];
            }
        }
        return naa; 
    }
}