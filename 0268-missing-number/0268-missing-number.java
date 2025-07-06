class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int expectedSum = 0;
        for(int i =0; i<=n-1; i++){
            expectedSum += nums[i];
        }
        return actualSum - expectedSum;
    }
}