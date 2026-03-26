class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int right =0;
        int left =0;
        int total =0;
        int n = nums.length;
        while(right < n){
            if(mpp.getOrDefault(nums[right],0) == 0){
                k--;
            }
            mpp.put(nums[right], mpp.getOrDefault(nums[right], 0)+1);
            while(k < 0){
                int val = mpp.get(nums[left]);
                mpp.put(nums[left], val -1);
                if(mpp.get(nums[left]) == 0){
                    k++;
                }
                left++;
            }
            total += right - left +1;
            right++;
        }
        return total;
    }
}