class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int j =0; j<n; j++){
            ans[j] = nums[nums[j]];
        }
        return ans;
    }
}