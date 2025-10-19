class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long last_T = Long.MIN_VALUE;
        long maxPossible = 0;
        int count =0;
       
        long start = 0;
        for(int num : nums){
            long minPossible = (long)num - k;
            start = Math.max(minPossible, last_T + 1);

            maxPossible = (long)num + k;
            if( start <= maxPossible){
                count++;
                last_T = start;
            }
        }
        return count;
    }
}