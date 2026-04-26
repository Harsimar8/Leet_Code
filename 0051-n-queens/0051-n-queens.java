class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        int row = 0;
        char[][] board = new char[n][n];
        for(char[] ab : board){
            Arrays.fill(ab , '.');
        }
        helper(board,res, row, n);
        return res;
    }
    public void helper(char[][] board, List<List<String>> res, int row , int n){
        if(row == n){
            res.add(convert(board));
        }
        for(int j =0; j<n; j++){
            if(isSafe(board, row, j, n)){
                board[row][j] = 'Q';
                helper(board, res, row+1, n);
                board[row][j] = '.';
            }
        }
        
    }
    public List<String> convert(char[][] board){
        List<String> ans = new ArrayList<>();
        for(char[] row : board){
            ans.add(new String(row));
        }
        return ans;
    }
    public boolean isSafe(char[][] board, int row, int col, int n){
        for(int i =0; i<row; i++){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        for(int i =row-1,j = col-1; i>=0 && j>=0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i =row-1,j = col+1; i>=0 && j<n ;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
}