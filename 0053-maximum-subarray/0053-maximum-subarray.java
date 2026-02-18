class Solution {
    public int maxSubArray(int[] nums) {
        int pref = 0;
        int suf = 0;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(pref < 0){
                pref = 0;
            }
            if(suf < 0){
                suf = 0;
            }
            pref += nums[i];
            suf += nums[n-1-i];

            maxi = Math.max(maxi, Math.max(pref, suf));
        }
        return maxi;
    }
}