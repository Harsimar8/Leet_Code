class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> st = new HashSet<>();
        int m = board.length;
        int n = board[0].length;

        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                char val = board[i][j];

                if(val == '.'){
                    continue;
                }
                if(!st.add(val + "in row" + i) || !st.add(val + "in col" + j) ||
                 !st.add(val + "in box" + (i/3) + "-" + (j/3))){
                    return false;
                 }
            }
        }
        return true;
    }
}