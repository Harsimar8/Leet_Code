class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m+1][n+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(word1, word2,m,n,dp);
    }
    public int helper(String word1, String word2, int i , int j,int[][]dp){
        if(i == 0){
            return j;
        }
        if(j == 0){
            return i;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(word1.charAt(i-1) == word2.charAt(j-1)){
            return dp[i][j] = helper(word1, word2, i-1,j-1,dp);
        }
        else{
            int one = helper(word1,word2, i-1, j-1,dp);
            int two = helper(word1,word2, i, j-1,dp);
            int three = helper(word1,word2, i-1, j,dp);
        
        return dp[i][j] = 1 + Math.min(one, Math.min(two, three));
        }
    }
}