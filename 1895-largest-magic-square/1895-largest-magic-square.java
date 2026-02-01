class Solution {
    public int largestMagicSquare(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int side = m>n ? n : m;
        while(side>0){
            for(int i =0; i<m; i++){
                for(int j=0; j<n; j++){
                    if(i+side<=m && j+side<=n){
                    if(isValid(grid,m,n,i,j,side)){
                        return side;
                    }
                    }
                }
            }
            side--;
        }
        return side;
    }
    public boolean isValid(int[][] mat, int m, int n, int i, int j, int side){
        int sum  =0;
        for(int x = i; x < i + side; x++){
            int ss = 0;
            for(int y = j; y< j + side; y++){
                ss += mat[x][y];
            }
            if(x == i){
                sum = ss;
            }
            else if(ss != sum){
                return false;
            }
        }
        for(int x = j; x < j + side; x++){
            int kk = 0;
            for(int y = i; y< i + side; y++){
                kk += mat[y][x];
            }
            if(kk!= sum){
                return false;
            }
        }
        int nn = 0;
        for(int k =0; k<side; k++){
            nn += mat[i+k][j+k];
        }
        if(nn != sum){
            return false;
        }

        int pp = 0;
        for(int k =0; k<side; k++){
            pp += mat[i+k][j+side-1-k];
        }
        if(pp != sum){
            return false;
        }


        return true;
    }
}