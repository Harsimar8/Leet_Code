class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return helper(dp,0,nums);
    }
    public int helper(int[] dp, int n, int[] nums){
        int s = nums.length;
        if(n>=s){
            return 0;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        int left = nums[n] + helper(dp,n+2,nums);
        int right = helper(dp,n+1,nums);
        dp[n] = Math.max(left,right);
        return dp[n];
    }
}