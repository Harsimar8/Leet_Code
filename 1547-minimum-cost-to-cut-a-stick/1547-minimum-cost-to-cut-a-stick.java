class Solution {
    public int minCost(int n, int[] cuts) {
        int m = cuts.length;
        int[] arr = new int[m+2];
        for(int i =1; i<=m; i++){
            arr[i] = cuts[i-1];
        }
        arr[0] = 0;
        arr[m+1] = n;
        Arrays.sort(arr);
        int[][] dp = new int[m+2][m+2];
        for(int[] row : dp){
            Arrays.fill(row,-1);
        }
        return helper(1,m,arr, dp);
    }
    public int helper(int i, int j, int[] arr, int[][] dp){
        if( i > j ){
            return 0;
        }
        int best = Integer.MAX_VALUE;
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        for(int k =i; k<=j ; k++){
            int cost = arr[j+1] - arr[i-1] + helper(i,k-1, arr, dp) + helper(k+1, j, arr, dp);
            best = Math.min(best, cost);
        }
        dp[i][j] = best;
        return dp[i][j];
    }
}