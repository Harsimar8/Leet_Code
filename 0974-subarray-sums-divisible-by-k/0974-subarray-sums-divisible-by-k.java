class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int right =0;
        int cnt =0;
        int pre =0;
        mpp.put(0,1);
        while(right < n){
            pre += nums[right];

           
           int val = ((pre % k + k) % k);
            if(mpp.containsKey(val)){
            cnt += mpp.get(val);
            }

            mpp.put(val, mpp.getOrDefault(val,0)+1);
            right++;
        }
        return cnt;
    }
}