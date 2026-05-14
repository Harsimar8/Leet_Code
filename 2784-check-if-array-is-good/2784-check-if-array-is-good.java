class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        for(int i =0; i<n; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        if(nums.length != maxi+1){
            return false;
        }
        Arrays.sort(nums);
        for(int k =1; k<=maxi; k++){
            if(nums[k-1] != k){
                return false;
            }
        }
        if(nums[n-1] != maxi){
            return false;
        }
        return true;
    }
}