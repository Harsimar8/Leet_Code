import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefixCount = new HashMap<>();
        prefixCount.put(0, 1); // base case: sum 0 occurs once

        int sum = 0, result = 0;

        for (int num : nums) {
            sum += num;

            // Check if there's a prefix sum that would make the subarray sum to goal
            result += prefixCount.getOrDefault(sum - goal, 0);

            // Record the current prefix sum
            prefixCount.put(sum, prefixCount.getOrDefault(sum, 0) + 1);
        }

        return result;
    }
}
