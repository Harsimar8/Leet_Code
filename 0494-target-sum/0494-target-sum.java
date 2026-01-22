class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int total =0;
        for(int i =0; i<n; i++){
            total += nums[i];
        }
        int k = target + total;
        if(k <0 || k%2 !=0){
            return 0;
        }
        int res = k/2;
        int[][] dp = new int[n+1][res+1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(nums, res,dp,n-1);
    }
    public int helper(int[] nums, int res, int[][] dp, int i){
        //  if(i < 0){
        //     if(res == 0){
        //         return 1;
        //     }
        //     else{
        //         return 0;
        //     }
        // }
        if (i == 0) {
    if (res == 0 && nums[0] == 0) return 2;
    if (res == 0 || nums[0] == res) return 1;
    return 0;
}

       
       if(dp[i][res] != -1){
        return dp[i][res];
       }
       int ways = 0;
        int Ntake = helper(nums, res, dp,i-1); 
        int take = 0;
        if(nums[i] <= res){
            take =  helper(nums, res- nums[i], dp,i-1) ;
        }
        return dp[i][res] = take + Ntake;
    }
}