class Solution {
    public boolean isValid(int m, int n, char c, char[][] board){
        for(int i =0; i < 9; i++){
            if(board[m][i] == c){
                return false;
            }
        }
        for(int j =0; j<9; j++){
            if(board[j][n] == c){
                return false;
            }
        }
        int rowS = 3 * (m/3);
        int colS = 3 * (n/3);
       for(int r = 0; r < 3; r++){
        for(int s = 0; s < 3; s++){
            if(board[rowS+r][colS+s]  == c){
                return false;
            }
        }
       }
       return true;
    }
    public boolean solveSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
            for(int j =0; j<9; j++){
                if(board[i][j] == '.'){
                    for(char c = '1'; c <= '9'; c++){
                        if(isValid(i,j,c,board)){
                        board[i][j] = c;
                        if(solveSudoku(board)){
                            return true; 
                        }
                        else{
                        board[i][j] = '.';
                        }
                        }
                        
                    }
                    return false;
                }
                
            }
        }
        return true;

    }
}