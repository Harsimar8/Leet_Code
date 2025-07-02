class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;
         transpose(mat,n);
        for(int i =0; i<n; i++){
            for(int j =0; j<n/2;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[i][n-j-1];
                mat[i][n-j-1] = temp;
            }
        }
        
        
    }
    // public void transpose(int[][] mat){
    //     int r = mat.length;
    //     int c = mat[0].length;
    //     int[][] arr = new int[r][c];
    //     for(int i =0; i<r; i++){
    //         for(int j =0; j<c; j++){
    //             arr[i][j] = mat[j][i]; 
    //         }
    //     }
        
    // }
    public void transpose(int[][] arr, int n){
     n = arr.length;
        for(int i =0; i<n; i++){
            for(int j =0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}