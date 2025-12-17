class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int old = image[sr][sc];
        helper(image,sr,sc,old,color, m,n);
        return image;
    }
    public void helper(int[][] image, int i, int j, int oldcolor ,int newcolor, int m , int n){
        if(i <0 || j <0 || i >= m || j >= n || image[i][j] == newcolor){
            return;
        }
        
        if(image[i][j] != oldcolor){
            return;
        }
        image[i][j] = newcolor;
        helper(image,i+1,j,oldcolor,newcolor,m,n);
        helper(image,i-1,j,oldcolor,newcolor,m,n);
        helper(image,i,j+1,oldcolor,newcolor,m,n);
        helper(image,i,j-1,oldcolor,newcolor,m,n);
    }
}