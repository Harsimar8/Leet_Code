class Solution {
    public int longestOnes(int[] nums, int k) {
       int left = 0;
       int maxi = 0;
       int cnt = 0;
       int p = 0;
       int n = nums.length;
       for(int right =0; right<n; right++){
        
        if(nums[right] == 0){
            cnt++;
            k--;
        }
        while(k < 0){
            if(nums[left] == 0){
               
                cnt--;
                k++;
            }
             left++;
        }
        
        maxi = Math.max(maxi, right - left + 1);
       } 
       return maxi;
    }
}