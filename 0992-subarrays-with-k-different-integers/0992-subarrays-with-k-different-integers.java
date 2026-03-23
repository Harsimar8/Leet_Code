class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return atMost(nums,k) - atMost(nums,k-1);
    }
    public int atMost(int[] nums, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        int res = 0;
        int left =0;
        for(int i =0; i<n; i++){
            if(mpp.getOrDefault(nums[i],0) == 0){
                k--;
            }
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0)+1);
            while(k < 0){
                mpp.put(nums[left], mpp.get(nums[left])-1);
                if(mpp.get(nums[left]) == 0){
                    k++;
                }
                left++;
            }
            res += i - left + 1;
        }
        return res;
    }
}