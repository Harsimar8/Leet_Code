class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        if(n == 1){
            return nums[0];
        }
        return Math.max(helper(dp,0,nums,n-2), helper(dp1,1,nums,n-1));
    }
    public int helper(int[] dp, int n, int[] nums , int end){
        
        int s = nums.length;
        if(n>end){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        
        int pick = nums[n] + helper(dp,n+2,nums, end);
        int share = helper(dp,n+1,nums, end);
        dp[n] = Math.max(pick,share);
        return dp[n];
    }
}