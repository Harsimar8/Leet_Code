class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return helper(nums, k) - helper(nums, k-1);
    }
    public int helper(int[] nums, int k){
        int n = nums.length;
        int right =0;
        int left =0;
        int cnt =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        while(right < n){
            if(mpp.getOrDefault(nums[right], 0) == 0){
                k--;
            }
            mpp.put(nums[right], mpp.getOrDefault(nums[right],0)+1);
            while( k < 0){
                mpp.put(nums[left], mpp.get(nums[left])-1);
                if(mpp.get(nums[left]) == 0){
                    k++;
                }
                left++;
            }
            cnt += (right - left + 1);
            right++;
        }
        return cnt;
    }
}