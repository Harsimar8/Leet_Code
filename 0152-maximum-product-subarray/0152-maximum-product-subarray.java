class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pref = 1;
        int suf = 1;
        int maxi = Integer.MIN_VALUE;
        int right =0;
        while(right < n){
            if(pref == 0){
                pref = 1;
            }
            if(suf == 0){
                suf= 1;
            }
            pref *= nums[right];
            suf *= nums[n - right - 1];
            maxi = Math.max(maxi, Math.max(pref, suf));
            right++;
        }
        return maxi;
    }
}