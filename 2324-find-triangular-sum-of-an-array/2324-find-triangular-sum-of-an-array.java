class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        
        // Repeat the process until the array has only one element
        while (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
            n--; // Reduce the length by 1 each iteration
        }
        
        return nums[0]; // The last remaining element
    }
}
