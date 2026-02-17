class Solution {
    public int partitionDisjoint(int[] nums) {
        int cmax = nums[0];
        int nmax =nums[0];
        int ans =0;
        int n = nums.length;
        for(int i =1; i<n; i++){
            int val = nums[i];
            nmax = Math.max(nmax, val);

            if(val < cmax){
                ans = i;
                cmax = nmax;
            }
        }
        return ans+1;
    }
}