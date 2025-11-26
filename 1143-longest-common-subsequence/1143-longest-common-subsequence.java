class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int[] ro : dp){
            Arrays.fill(ro,-1);
        }
        int ind1 = n1-1;
        int ind2 = n2- 1;
        return helper(text1,text2,ind1, ind2,dp);

    }
    public int helper(String text1, String text2, int i, int j,int[][] dp){
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return dp[i][j] = 1 + helper(text1, text2,i-1,j-1,dp);
        }
        else{
            return dp[i][j] = Math.max(helper(text1,text2,i-1,j,dp),helper(text1, text2,i,j-1,dp));
        }
    }
}