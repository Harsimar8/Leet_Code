class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        int i = n-1;
        return helper(coins, dp, amount,i);
     }
     public int helper(int[] coins, int[][] dp, int sum, int i){
        if(sum == 0){
            return 1;
        }
        if( i < 0){
            return 0;
        }
        if(dp[i][sum] != -1){
            return dp[i][sum];
        }
        if(coins[i] <= sum){
            return dp[i][sum] =  helper(coins, dp, sum - coins[i],i) + helper(coins, dp, sum,i-1);
        }
        else{
           return dp[i][sum] = helper(coins, dp, sum,i-1);
        }
     }
}