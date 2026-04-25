class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];
        boolean ff = false;
        for(int k =0; k<m; k++){
            for(int l = 0; l<n; l++){
                boolean val = false;
                val = helper(vis, board, word, m,n,k,l,0);
                if(val){
                    ff = true;
                    break;
                }
            }
        }
        return ff;
    }
    public boolean helper(boolean[][] vis, char[][] board, String word, int m ,int n, int i, int j, int ind){
        if(i<0 || j <0 || i>=m || j >= n || board[i][j] != word.charAt(ind) || vis[i][j] == true){
            return false;
        }
        
        if(ind == word.length()-1){
            return true;
        }
        vis[i][j] = true;
        boolean found = false;
        found = helper(vis, board, word, m,n,i+1,j,ind+1) || helper(vis, board, word, m,n,i-1,j,ind+1)
              || helper(vis, board, word, m,n,i,j+1,ind+1) || helper(vis, board, word, m,n,i,j-1,ind+1);
        vis[i][j] = false;

         return found;     
    }
}