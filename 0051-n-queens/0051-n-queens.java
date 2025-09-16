class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for(int i =0; i<n;i++){
            Arrays.fill(board[i],'.');
        }
        List<List<String>> res = new ArrayList<>();
        int row = 0;
        return nQueen(board, res, row, n);
    }
    public boolean isSafe(char[][] board, int row, int col, int n){
        for(int j = 0; j<row; j++){
            if(board[j][col] == 'Q'){
                return false;
            }
        }
        for(int i =row-1,  j=col-1; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        for(int i =row-1, j= col+1 ; i>=0 && j<n ; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;

    }
    public   List<List<String>> nQueen(char[][] board,List<List<String>> ans,int row, int n){
        if(row == n){
            ans.add(convert(board));
            
        }
        for(int j =0; j<n;j++){
            if(isSafe(board, row, j, n)){
                board[row][j] = 'Q';
                nQueen(board, ans, row +1, n);
                board[row][j] ='.';
            }
            
        }
        return ans; 
    }

    public List<String> convert(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row : board){
            res.add(new String(row));
        }
        return res;
    }

}