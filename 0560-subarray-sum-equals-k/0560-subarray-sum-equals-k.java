class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int cnt =0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int preSum =0;
        for(int i =0; i<n; i++){
            preSum += nums[i];
            int rem = preSum -k;
            cnt += mpp.getOrDefault(rem,0);

            mpp.put(preSum, mpp.getOrDefault(preSum,0)+1);
        }
        return cnt;
    }
}