class Solution {
    public int orangesRotting(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();
        int cnt_F = 0;
        int cnt = 0;
        int time = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i =0; i<m; i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i,j});
                }
                if(grid[i][j] != 0){
                    cnt_F++;
                }
            }
        }
        if(cnt_F == 0){
            return 0;
        }
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        while(!q.isEmpty()){
            int size = q.size();
            cnt += size;
            for(int i =0; i<size; i++){
                int[] point = q.poll();
                for(int j =0; j<4; j++){
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                if(x < 0 || y < 0|| x >= m || y >= n || grid[x][y] == 2 || grid[x][y] == 0){
                    continue;
                    }
                    grid[x][y] = 2;
                    q.offer( new int[]{x,y});
                }
            }
            if(q.size() != 0){
                time++;
            }
        }
        return (cnt_F == cnt) ? time : -1;
    }
}