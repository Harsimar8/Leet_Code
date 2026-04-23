class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int[] ans  = new int[n+n];
        int curMax = 0;
        int curMin = 0;
        int maxi = nums[0];
        int mini = nums[0];
        int total =0;
        for(int i =0; i<n; i++){
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxi = Math.max(curMax, maxi);

            curMin = Math.min(curMin + nums[i], nums[i]);
            mini = Math.min(curMin, mini);
            total += nums[i];
        }
        if(maxi < 0){
            return maxi;
        }
        return Math.max(maxi, total - mini);

    }
}