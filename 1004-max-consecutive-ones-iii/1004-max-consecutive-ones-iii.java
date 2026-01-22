class Solution {
    public int longestOnes(int[] nums, int k) {
       int left = 0;
       int maxi = 0;
       int cnt = 0;
       int p = 0;
       int n = nums.length;
       for(int right =0; right<n; right++){
        if(nums[right] == 0){
            p++;
            cnt++;
        }
        else{
            cnt++;
        }
        while(p>k){
            if(nums[left] == 0){
                p--;
            }
            left++;
        }
        
        maxi = Math.max(maxi, right - left + 1);
       } 
       return maxi;
    }
}