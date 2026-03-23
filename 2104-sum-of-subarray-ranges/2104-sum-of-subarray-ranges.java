class Solution {
    public long subArrayRanges(int[] nums) {
       int n = nums.length;
       long res = 0;
       for(int i =0; i<n; i++){
        long maxi  = nums[i];
        long mini = nums[i];
        for(int j =i; j<n; j++){
            maxi = Math.max(maxi, (long)nums[j]);
            mini = Math.min(mini, (long)nums[j]);
            res += maxi  -mini;
        }
       
       }
        return res; 
    }
}