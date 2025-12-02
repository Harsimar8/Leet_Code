class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans = Integer.MIN_VALUE;
        int[][] dp  = new int[n1+1][n2+1];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        for(int i =0; i<n1; i++){
            for(int j =0; j<n2; j++){
                ans = Math.max(ans, helper(nums1,nums2,dp,i,j,n1-1,n2-1));
            }
        }
        return ans;
    }
    public int helper(int[] nums1, int[] nums2, int[][] dp ,int i, int j, int m , int n){
        if( i >m  || j > n){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(nums1[i] == nums2[j]){
            return dp[i][j] =  1 + helper(nums1, nums2, dp, i+1,j+1,m,n);
        }
        else{
            return dp[i][j]  = 0;
        }
    }
}