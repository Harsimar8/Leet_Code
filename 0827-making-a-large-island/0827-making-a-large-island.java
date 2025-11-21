class Union{
    int[] parent;
    int[] size;

    Union(int n){
        parent = new int[n];
        size = new int[n];
        for(int i =0; i<n; i++){
            parent[i] = i;
            size[i] = 1;
        }
    }

    int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    void unionBySize(int a, int b){
        int pa = find(a);
        int pb = find(b);
        if(pa == pb){
            return;
        }
        if(size[pa] < size[pb]){
            parent[pa] = pb;
            size[pb] += size[pa];
        }
        else{
            parent[pb] = pa;
            size[pa] += size[pb];
        }
    }
}
class Solution {
    public boolean isValid(int r, int c, int n){
        return (r >=0 && r < n && c >=0 && c < n);
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length;
        Union ds = new Union(n*n);
        int[] dr = {-1,0,1,0};
        int[] dc = {0,-1,0,1};
        for(int row = 0; row < n; row++){
            for(int col = 0; col<n; col++){
                if(grid[row][col] == 0) continue;
                for(int i = 0; i < 4; i++){
                    int newR = row + dr[i];
                    int newC = col + dc[i];
                    int old = row * n + col;
                    int cur = newR * n + newC;
                    if(isValid(newR, newC, n) && grid[newR][newC] == 1){
                        ds.unionBySize(old,cur);
                    }
                }
            }
        }

        int mx = 0;
        
        for(int row = 0; row < n; row++){
            for(int col = 0; col<n; col++){
                int sizeT = 0;
                Set<Integer> comp = new HashSet<>();
                if(grid[row][col] == 1) continue;
                for(int i = 0; i < 4; i++){
                    int newR = row + dr[i];
                    int newC = col + dc[i];
                    int old = row * n + col;
                    int cur = newR * n + newC;
                    if(isValid(newR, newC, n) && grid[newR][newC] == 1){
                        comp.add(ds.find(newR * n + newC));
                    }
                    
                }
                for(int a : comp){
                    sizeT += ds.size[a];
                 }
                 mx = Math.max(mx, sizeT + 1);
                  

            }
        }
        for(int j =0; j<n*n;j++){
            if(grid[j/n][j%n] == 1){
                mx = Math.max(mx,ds.size[ds.find(j)]);
            }
        }
        return mx;
    }
}