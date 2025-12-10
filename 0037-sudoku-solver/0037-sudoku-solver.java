class Solution {
    public void solveSudoku(char[][] board) {
        int r  =board.length;
        int c = board[0].length;
        helper(board, 0,0,9,9);
    }
    public boolean helper(char[][] board, int i, int j, int r, int c){
        if(j == c){
            return helper(board,i+1,0,r,c);
        }
        if(i == r){
            return true;
        }
        if(board[i][j] != '.'){
            return helper(board,i,j+1,r,c);
        }
        boolean val = false;
        for(char p= '1'; p<='9'; p++){
            
            if(check(board,i,j,r,c,p)){
                board[i][j] = p;
                if(helper(board,i,j+1,r,c)){
                    return true;
                }
                 board[i][j] = '.';   
            }
             
        }    
         return false;
            
    }
    
    public boolean check(char[][] board, int i, int j, int r, int c,char p){
        for(int k =0; k<c; k++){
            if(board[i][k] == p){
                return false;
            }
        }
        for(int l =0; l<r; l++){
            if(board[l][j] == p){
                return false;
            }
        }
        int sR = (i/3) * 3;
        int eR = (j/3) * 3;
        
        for(int aa = sR; aa<sR +3; aa++){
            for(int bb = eR; bb<eR +3; bb++){
                if(board[aa][bb] == p){
                    return false;
                }
            }
        }
        return true;
    }
}