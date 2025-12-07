class Solution {
    public int minInsertions(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        int m = s.length();
        int n = s1.length();
        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int ans = helper(s,s1,dp,m-1,n-1);
        int len = s.length();
        return len - ans;
    }

    public int helper(String s, String s1, int[][] dp, int i, int j){
        if( i< 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(s.charAt(i) == s1.charAt(j)){
            return dp[i][j] = 1 + helper(s,s1,dp,i-1,j-1);
        }
        else{
            return dp[i][j] = Math.max(helper(s,s1,dp,i-1,j), helper(s,s1,dp,i,j-1));
        }
    }
}