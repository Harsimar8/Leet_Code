class Solution {
    public int maxProduct(int[] nums) {
        int pref = 1;
        int suf = 1;
        int maxi = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(pref == 0){
                pref = 1;
            }
            if(suf == 0){
                suf = 1;
            }
            pref *= nums[i];
            suf *= nums[n-1-i];

            maxi = Math.max(maxi, Math.max(pref, suf));
        }
        return maxi;
    }
}