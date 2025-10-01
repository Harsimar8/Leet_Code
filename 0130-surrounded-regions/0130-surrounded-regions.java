class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        bfs(board, visited);
    }
    public void bfs(char[][] board, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        int m = board.length;
        int n = board[0].length;
        for(int i =0; i<m; i++){
            if(board[i][0] == 'O'){
                visited[i][0] = true;
                q.offer(new int[]{i,0});
            }
            if(board[i][n-1] == 'O'){
                 visited[i][n-1] = true;
                q.offer(new int[]{i,n-1});
            }
        }
        for(int i =0; i<n; i++){
            if(board[0][i] == 'O'){
                visited[0][i] = true;
                q.offer(new int[]{0,i});
            }
            if(board[m-1][i] == 'O'){
                 visited[m-1][i] = true;
                q.offer(new int[]{m-1,i});
            }
        }
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        while(!q.isEmpty()){
            int[] p  = q.poll();
            for(int i =0; i<4; i++){
                int x = p[0] + dx[i];
                int y = p[1] + dy[i];

                if(x < 0 || y <0 || x >=m || y >=n || board[x][y] == 'X' || visited[x][y] == true){
                    continue;
                }
                else{
                    visited[x][y] = true;
                    q.offer(new int[]{x,y});
                }
            }
        }
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(visited[i][j] == false && board[i][j] == 'O'){
                     visited[i][j] = true;
                    board[i][j] = 'X';
                   
                }
            }
        }

    }
}