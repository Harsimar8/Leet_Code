class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int cur = 0;
        int maxi = Integer.MIN_VALUE;
        if(n == 1){
            return nums[0];
        }
        for(int i =0; i<n; i++){
            cur += nums[i];
            maxi = Math.max(maxi, cur);
            if(cur < 0){
                cur = 0;
            }
            
            
            
        }
        return maxi;
    }
}