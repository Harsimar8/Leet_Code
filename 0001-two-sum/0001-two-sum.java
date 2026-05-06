class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            int tt = target - nums[i];
            if(mpp.containsKey(tt)){
                return new int[]{i, mpp.get(tt)};
            }
            else{
                mpp.put(nums[i],i);
            }
        }
        // If no solution found
        return new int[] {};
    }
}