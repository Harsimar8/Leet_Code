class Solution {
    public int findMin(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i =0; i<n;i++){
            if(nums[i] < mini){
                mini = nums[i];
            }
        }
        return mini;
    }
}