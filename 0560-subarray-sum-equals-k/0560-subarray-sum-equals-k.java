class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int right =0;
        int left =0;
        int total =0;
        int ans = 0;
        while(right < n){
            total += nums[right];
            if(mpp.containsKey(total - k)){
                int val = mpp.get(total - k);
                ans += val;
                
            }
             mpp.put(total, mpp.getOrDefault(total,0)+1);
            right++;
        }
        return ans;
    }
}