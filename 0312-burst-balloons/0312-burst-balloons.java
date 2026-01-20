class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0] = 1;
        arr[n+1] = 1;
        for(int i =0; i<n; i++){
            arr[i+1] = nums[i];
        }
        int[][] dp = new int[n+2][n+2];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return helper(arr, 1, n, dp);
    }
    public int helper(int[] arr, int i, int j, int[][] dp){
        if(i > j){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int maxi = Integer.MIN_VALUE;
        for(int k =i; k<=j; k++){
            int c1 = helper(arr, i,k-1,dp);
            int c2 = helper(arr, k+1,j,dp);
            int c3 = arr[i-1] * arr[j+1] * arr[k];
            maxi = Math.max(maxi, c1 + c2 + c3);
        }
        return dp[i][j] = maxi;
    }
}