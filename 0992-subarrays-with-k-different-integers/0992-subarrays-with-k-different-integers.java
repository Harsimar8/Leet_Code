class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        int n = nums.length;
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums, int k){
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int i =0;
        int res =0;
        int n = nums.length;
        for(int j =0; j<n; j++){
            if(mpp.getOrDefault(nums[j],0) == 0){
                k--;
            }
            mpp.put(nums[j], mpp.getOrDefault(nums[j],0)+1);
            while( k < 0){
                mpp.put(nums[i], mpp.get(nums[i]) -1);
                if(mpp.get(nums[i]) == 0){
                    k++;
                }
                i++;
            }
            res += j- i+1;
        }
        return res;
    }
}