class Solution {
    Integer[][] dp;
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n + 2];
         arr[0] = 1;
         arr[n+1] = 1;
         dp = new Integer[n+2][n+2];
         for(int i =0; i<n;i++){
            arr[i+1] = nums[i];
         }
        return helper(arr, 1, n);
    }
    public int helper(int[] arr, int i, int j){
        if(i>j){
            return 0;
        }
        int ans = 0;
        if(dp[i][j] != null){
            return dp[i][j];
        }
        for(int k =i; k<=j; k++){
            int c1 = helper(arr,i,k-1);
            int c2 = helper(arr,k+1, j);
            int c3 = arr[i-1] * arr[k] * arr[j+1];
            int tc = c1 + c2 + c3;
            ans = Math.max(ans,tc);

        }
        return dp[i][j] = ans;
    }
}




