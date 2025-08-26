class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int r= image.length;
        int c = image[0].length;
        if(sr<0 || sr >= r || sc< 0 || sc>=c){
            return image;
        }
        int original = image[sr][sc];
        if(original == color){
            return image ;
        }
        dfs(image, sr, sc,original, color, r,c);
        return image;
    }
    public void dfs(int[][] image, int sr, int sc, int original, int newC, int r, int c){
        
        if(sr<0 || sr >= r || sc< 0 || sc>=c){
            return;
        }
        int right =image[sr][sc];
        
        if(right == newC || original != right ){
            return;
        }
        image[sr][sc] = newC;
        dfs(image, sr-1,sc,original, newC, r, c);
        dfs(image, sr+1,sc,original, newC, r, c);
        dfs(image, sr,sc-1,original, newC, r, c);
        dfs(image, sr,sc+1,original, newC, r, c);
    }
}