class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int pre = 0;
        int suf =0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(pre == 0){
                pre = 1;
            }
            if(suf == 0){
                suf =1;
            }
            pre *= nums[i];
            suf *= nums[n-i-1];
            maxi = Math.max(maxi, Math.max(pre,suf));
        }
        return maxi;    

    }
    
}