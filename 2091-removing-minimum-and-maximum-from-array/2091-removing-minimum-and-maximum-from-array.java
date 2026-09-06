class Solution {
    public int minimumDeletions(int[] nums) {
        int left = 0;
        int right =0;
        int n = nums.length;
        for(int i =1; i<n; i++){
            if(nums[i] < nums[left]){
                left = i;
            }
            if(nums[i] > nums[right]){
                right = i;
            }
        }
        if(left < right){
            int telp = left;
            left = right;
            right = telp;
        }
        int ans = n;
        for(int j =0; j<=n; j++){
            int extra = 0;
            if(right >= j){
                extra = n - right;
            }
            else if(left >= j){
                extra = n - left;
            }
            ans = Math.min(ans, j + extra);
        }
        return ans;
        
        
        
    }
}