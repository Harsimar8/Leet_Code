class Solution {
    public int minFallingPathSum(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;
        
        int[][] dp = new int[m][n];
        for(int p = 1; p<m;p++){
            for(int s = 0; s < n; s++){
                dp[p][s] = -1;
            }
        }
        for(int i =0; i<n; i++){
            dp[0][i] = nums[0][i];
        }
        int mini = Integer.MAX_VALUE;
        

        for(int k =1; k<m; k++){
            for(int l = 0; l<n; l++){
               int one = Integer.MAX_VALUE;
               int two = Integer.MAX_VALUE;
               int three = Integer.MAX_VALUE;
                if(k>0 && l > 0) one = nums[k][l] + dp[k-1][l-1];
                if(k > 0 ) two = nums[k][l] + dp[k-1][l];
                if(k>0 && l < n-1) three = nums[k][l] + dp[k-1][l+1];

                dp[k][l] = Math.min(one, Math.min(two,three));
            }
        }
        for(int x =0; x<n;x++){
            mini = Math.min(mini, dp[m-1][x]);
        }
        return mini;
    }
    
}