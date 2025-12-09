class Solution {
    public boolean isValid(int i, int j, int m, int n){
        return (i >=0 && j >=0 && i < m && j < n);
    }
    public int closedIsland(int[][] grid) {
        int[] dir = {-1,0,1,0};
        int[] dic = {0,-1,0,1};
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];
        int cnt =0;
        Queue<int[]> pq = new ArrayDeque<>();
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                boolean isClosed = true;
                if(grid[i][j] == 0 && vis[i][j] == false){
                    pq.offer(new int[]{i,j});
                    vis[i][j] = true;
                
                
                while(!pq.isEmpty()){
                    int[] cur = pq.poll();
                    int a =  cur[0];
                    int b = cur[1];
                    if(a ==0 || a == m-1 || b ==0 || b == n-1){
                        isClosed = false;
                    }
                    for(int k =0; k<4; k++){
                        int newR = a + dir[k];
                        int newC = b + dic[k];
                        if(isValid(newR, newC, m, n) && grid[newR][newC] == 0 && vis[newR][newC] == false ){
                            pq.offer(new int[]{newR, newC});
                            vis[newR][newC] = true;
                        }
                    }
                    
                }
                if(isClosed){
                    cnt++;
                }
                }
                
            }
        }
        return cnt;
    }
}