class Solution {
    public boolean predictTheWinner(int[] nums) {
    return canWin(nums, 0, nums.length - 1) >= 0;
}

private int canWin(int[] nums, int start, int end) {
    if (start == end) return nums[start];
    int pickStart = nums[start] - canWin(nums, start + 1, end);
    int pickEnd = nums[end] - canWin(nums, start, end - 1);
    return Math.max(pickStart, pickEnd);
}

    
}