class Solution {
    public int maxSubArray(int[] nums) {
        int pref = 0;
        int suf = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        int right =0;
        int sum =0;
        int left =0;
        while(right < n){
            sum += nums[right];
             if(sum > maxi){
            maxi = Math.max(sum, maxi);
            }
            if(sum < 0){
                sum = 0;
                left = right + 1;
            }
           
            right++;
        }
        return maxi;
    }
}