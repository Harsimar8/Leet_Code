class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix= new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left =0;
        int right = n-1;
        int val =1;
        while(left <= right && top <=bottom){
            for(int i =left; i<=right; i++){
                matrix[top][i] = val;
                val+=1;
            }
            top++;
            for(int j =top; j<=bottom;j++){
                matrix[j][right] = val;
                val+=1;
            }
            right--;
            if(top <= bottom){
            for(int k =right; k>=left; k--){
                matrix[bottom][k] = val;
                val+=1;
            }
            bottom--;
            }
            if(left <= right){
            for(int l =bottom; l>=top; l--){
                matrix[l][left] = val;
                val+=1;
            }
            left++;
            }
            
        }
        return matrix;

    }
}