class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actual_s = (n * (n +1)) / 2;
        int expected_sum = 0;
        for(int num: nums){
            expected_sum += num;
        }
        return actual_s - expected_sum;
    }
}