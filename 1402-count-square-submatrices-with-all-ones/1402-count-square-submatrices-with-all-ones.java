class Solution {
    public int countSquares(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int cnt =0;
        for(int i =0; i<r; i++){
            for(int j= 0; j<c; j++){
                int MaxS = Math.min(r -i, c-j);
                for(int size =1; size<=MaxS; size++){
                    if(isSquare(matrix,i,j,size)){
                        cnt++;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        return cnt;
    }
    public boolean isSquare(int[][] matrix , int row, int col , int size){
        for(int i =row; i<row + size; i++){
            for(int j = col ;  j<col +size; j++){
                if(matrix[i][j] != 1){
                    return false;
                }
            }
        }
        return true;
    }
}