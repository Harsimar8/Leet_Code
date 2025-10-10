class Solution {
    public int numEnclaves(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int count = 0;
        boolean[][] visited = new boolean[r][c];
        for(int p = 0; p<c; p++){
            if(grid[0][p] == 1){
            visited[0][p] = true;
            dfs(grid, visited, count,0,p);
            }
        }
        for(int q = 0; q<c; q++){
           
            if(grid[r-1][q] == 1){
            visited[r-1][q] = true;
            dfs(grid, visited, count,r-1,q);
            
            }
        }
        for(int t = 0; t<r;t++){
            if(grid[t][0] == 1){
            visited[t][0] = true;
            dfs(grid,visited, count,t,0);
            }
        }
        for(int l =0; l<r; l++){
            if(grid[l][c-1] == 1){
            visited[l][c-1] = true;
            dfs(grid,visited,count,l,c-1);
            }
        }
        int cnt =0;
        for(int i =0; i<r; i++){
            for(int j =0; j<c; j++){
                if(visited[i][j] == false && grid[i][j] == 1){
                    cnt++;
                    visited[i][j] = true;
                }
            }
        }
        return cnt;
    }
    public void dfs(int[][] grid, boolean[][] visited,int count, int i , int j){
        int r = grid.length;
        int c = grid[0].length;
        
        int[] dx ={0,0,-1,1};
        int[] dy ={-1,1,0,0};

        for(int k =0; k<4; k++){
            int x = i + dx[k];
            int y = j + dy[k];

            if(x < 0 || y <0 || x>=r || y>=c || grid[x][y] == 0 || visited[x][y] == true){
                continue;
            }
            else{
                visited[x][y] = true;
                dfs(grid, visited,count, x, y);
            }
        }
    }
}