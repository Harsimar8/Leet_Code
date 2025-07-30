class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        int n = nums.length;
        Map<Integer,Integer> mpp = new HashMap<>();
        for(int i =0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0) +1);
        }
        
        for(int key : mpp.keySet()){
            if(mpp.containsKey(key +k)){
                cnt += mpp.get(key) * mpp.get(key +k);
            }
        }
        return cnt;
    }
}