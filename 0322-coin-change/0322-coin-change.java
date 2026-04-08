class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
       int[][] dp = new int[n+1][amount+1];
       for(int[] row : dp){
        Arrays.fill(row, -1);
       }
       int ans = (int) (1e9) + 7;
       ans = helper(coins, amount, n-1, dp);
       return (ans >= (int) (1e9) + 7) ? -1 : ans;
    }
    public int helper(int[] coins, int amount, int i, int[][] dp){
       if(amount == 0){
        return 0;
       }
       if(dp[i][amount] != -1){
        return dp[i][amount];
       }
       if(i == 0 && amount != 0){
        if(coins[0] <= amount){
            return 1 + helper(coins, amount - coins[i], i, dp);
        }
        else{
            return (int) (1e9) + 7;
        }

       }
       int not = helper(coins, amount, i-1, dp);
       int take = (int) (1e9) + 7;

       if(coins[i] <= amount){
        take = 1 + helper(coins, amount - coins[i], i, dp);
       }
       return dp[i][amount] = Math.min(take, not);
    }
}