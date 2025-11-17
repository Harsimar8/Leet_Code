class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int cnt = 0;
        int n = nums.length;
        int left =0;
        for(int i =0; i<n;i++){
            if(nums[i] == 1){
                left = i;
                break;
            }
        }
        
        int right = left +1;
        
        while(left < n && right < n){
            int len = 0;
            if(nums[right] == 1){
                len = right - left - 1;
                left = right;
                right++;
                if(len < k){
                return false;
            }
            }
            
            else{
            right++;
            }
        }
        return true;
    }
}