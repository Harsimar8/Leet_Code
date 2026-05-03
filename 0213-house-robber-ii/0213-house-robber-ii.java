class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] skipFirst = new int[n-1];
        int[] skipLast = new int[n-1];
        for(int i =0; i<n-1; i++){
            skipFirst[i] = nums[i+1];
            skipLast[i] = nums[i];
        }
        int[] dp1 = new int[skipFirst.length];
        int[] dp2 = new int[skipLast.length];
        int one = helper(skipFirst, dp1);
        int two = helper(skipLast, dp2);
        return Math.max(one, two);
    }
    public int helper(int[] arr, int[] dp){
        
        int n = arr.length;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return arr[0];
        }
        dp[0] = arr[0];
        dp[1] = Math.max(arr[1], arr[0]);
        for(int i =2; i<n; i++){
            dp[i] = Math.max(arr[i] + dp[i-2], dp[i-1]);
        }
        return dp[n-1];
    } 
}