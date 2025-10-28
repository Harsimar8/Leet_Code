class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + nums[i];
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                if (arr[n] == 2 * arr[i]) {
                    ans += 2;
                } else if (Math.abs(arr[n] - 2 * arr[i]) == 1) {
                    ans += 1;
                }
            }
        }

        return ans;
    }
}