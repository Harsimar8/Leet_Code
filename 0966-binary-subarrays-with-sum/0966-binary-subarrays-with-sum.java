import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> preC = new HashMap<>();
        preC.put(0, 1); 

        int sum = 0, res = 0;

        for (int num : nums) {
            sum += num;

            
            res += preC.getOrDefault(sum - goal, 0);

            preC.put(sum, preC.getOrDefault(sum, 0) + 1);
        }

        return res;
    }
}
