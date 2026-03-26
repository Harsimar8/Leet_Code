import java.util.*;

class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        
        // Step 1: pair value with index
        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = nums[i]; // value
            arr[i][1] = i;       // index
        }

        // Step 2: sort by value
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int[] result = new int[n];
        
        int i = 0;
        while (i < n) {
            List<Integer> indices = new ArrayList<>();
            List<Integer> values = new ArrayList<>();

            indices.add(arr[i][1]);
            values.add(arr[i][0]);

            int j = i + 1;

            // Step 3: build group
            while (j < n && arr[j][0] - arr[j - 1][0] <= limit) {
                indices.add(arr[j][1]);
                values.add(arr[j][0]);
                j++;
            }

            // Step 4: sort indices
            Collections.sort(indices);

            // values already sorted (since arr sorted)

            // Step 5: assign smallest values to smallest indices
            for (int k = 0; k < indices.size(); k++) {
                result[indices.get(k)] = values.get(k);
            }

            i = j;
        }

        return result;
    }
}