class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int old = image[sr][sc];
        helper(image, sr, sc, old, color,m,n);
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int oldC, int newC, int m, int n){
        if(sr <0 || sc < 0 || sr >= m || sc >= n || image[sr][sc] == newC ){
            return;
        }
        if(image[sr][sc] != oldC){
            return;
        }
        image[sr][sc] = newC;
        helper(image, sr+1, sc, oldC, newC,m,n);
        helper(image, sr-1, sc, oldC, newC,m,n);
        helper(image, sr, sc+1, oldC, newC,m,n);
        helper(image, sr, sc-1, oldC, newC,m,n);

    } 
}