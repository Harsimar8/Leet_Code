class Solution {
    public void solveSudoku(char[][] board) {
        boolean ans = helper(board, 0,0);
    }
    public boolean helper(char[][] board, int i, int j){
        if(j == 9){
            return helper(board, i+1, 0);
        }
        if(i == 9){
            return true;
        }
        if(board[i][j] != '.'){
            return helper(board,i,j+1);
        }
        for(char k = '1'; k<='9'; k++){
            if(isSafe(board, i,j,k)){
                board[i][j] = k;
                if(helper(board,i,j+1)){
                    return true;
                }
                board[i][j] = '.';
            }
        }
        return false;
    }
    public boolean isSafe(char[][] board, int row, int col, char key){
        for(int i =0; i<9; i++){
            if(board[row][i] == key){
                return false;
            }
        }
        for(int j =0; j<9; j++){
            if(board[j][col] == key){
                return false;
            }
        }

        int startR = (row/3) * 3;
        int startC = (col/3) * 3;

        for(int i = startR; i<startR + 3; i++){
            for(int j = startC; j<startC+ 3; j++){
                if(board[i][j] == key){
                    return false;
                }
            }
        }
        return true;
    }
}