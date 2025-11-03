class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] board = new int[m][n];

        for(int[] pos : guards){
            int r = pos[0];
            int c = pos[1];
            board[r][c] = 'G';
        }

        for(int[] pos : walls){
            int r = pos[0];
            int c = pos[1];
            board[r][c] = 'W';
        }

        for(int i =0; i<m;i++){
            boolean found = false;
            for(int j =0; j<n; j++){
                if(board[i][j] == 'W'){
                    found = false;
                }
                else if(board[i][j] == 'G'){
                    found = true;
                }
                else if(found){
                    board[i][j] = 'V';
                }
            }
        }

        for(int i =0; i<m;i++){
            boolean found = false;
            for(int j =n-1; j>=0; j--){
                if(board[i][j] == 'W'){
                    found = false;
                }
                else if(board[i][j] == 'G'){
                    found = true;
                }
                else if(found){
                    board[i][j] = 'V';
                }
            }
        }

        for(int j =0; j<n;j++){
            boolean found = false;
            for(int i=0; i<m; i++){
                if(board[i][j] == 'W'){
                    found = false;
                }
                else if(board[i][j] == 'G'){
                    found = true;
                }
                else if(found){
                    board[i][j] = 'V';
                }
            }
        }

        for(int j =n-1; j>=0;j--){
            boolean found = false;
            for(int i =m-1; i>=0; i--){
                if(board[i][j] == 'W'){
                    found = false;
                }
                else if(board[i][j] == 'G'){
                   found = true;
                }
                else if(found){
                    board[i][j] = 'V';
                }
            }
        }

        int cnt =0;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(board[i][j] != 'V' && board[i][j] != 'G' && board[i][j] != 'W'){
                    cnt++;
                }
            }
        }
        return cnt;

    }
}