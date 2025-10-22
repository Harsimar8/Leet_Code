import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0, 1);

        int oddC = 0, res = 0;

        for (int num : nums) {
            if (num % 2 != 0) oddC++;

            res += mpp.getOrDefault(oddC - k, 0);
            mpp.put(oddC, mpp.getOrDefault(oddC, 0) + 1);
        }

        return res;
    }
}
