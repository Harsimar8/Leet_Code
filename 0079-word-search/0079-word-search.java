class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m+1][n+1];
        int index = 0;
        for(int i =0; i<m; i++){
           
            for(int j =0; j<n; j++){
               boolean ans =  helper(board, i,j,m,n, arr,vis,0);
                if(ans == true){
                    return true;
                }
            }
        }
        return false;
        
    }
    public boolean helper(char[][] board, int i, int j, int m, int n,char[] arr,boolean[][] vis, int index){
        if(i<0 || j<0 || i>=m || j>=n || vis[i][j] == true || board[i][j] != arr[index]){
            return false;
        }
        if(index == arr.length-1){
            return true;
        }
        vis[i][j] = true;
        boolean found = helper(board,i+1,j,m,n,arr,vis, index+1) ||
                    helper(board,i-1,j,m,n,arr,vis, index+1) ||
                    helper(board,i,j+1,m,n,arr,vis, index+1) ||
                    helper(board,i,j-1,m,n,arr,vis, index+1);
        vis[i][j] = false;
        return found;            
    }
}