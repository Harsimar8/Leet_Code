class Solution {
    public int minimumDifference(int[] nums, int k) {
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<=n-k; i++){
            int diff = 0;
            int one = nums[i];
            int two = nums[i+k-1];
            diff = two - one;
            if(diff > 0){
                mini = Math.min(mini, diff);
            }
        }
        return mini == Integer.MAX_VALUE ? 0 : mini;
    }
}