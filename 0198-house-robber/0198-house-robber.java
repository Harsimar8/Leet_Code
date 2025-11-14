class Solution {
    int[] dp;
    public int rob(int[] nums) {
        int n = nums.length;
        dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(0,nums);
    }
    public int helper(int n, int[] nums){
        int s = nums.length;
        if(n>=s){
            return 0;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        int left = nums[n] + helper(n+2,nums);
        int right = helper(n+1,nums);
        dp[n] = Math.max(left,right);
        return dp[n];
    }
}