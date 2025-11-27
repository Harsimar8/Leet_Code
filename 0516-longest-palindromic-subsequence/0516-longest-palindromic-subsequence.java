class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        String s1 = sb.reverse().toString();
        int m = s.length();
        int n = s1.length();
        int[][] dp = new int[m+1][n+1];
        return helper(s,s1,dp,m,n);
    }
    public int helper(String s1,String s2, int[][] dp, int m, int n){
        int ans =0;
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                    ans = Math.max(ans,dp[i][j]);
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return ans;
    }
}