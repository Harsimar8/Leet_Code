class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
      HashMap<Integer ,Integer> mpp = new HashMap<>();
      int i =0;
      int j =0;
      int res =0;
      while(j < nums.length){
        mpp.put(nums[j],mpp.getOrDefault(nums[j],0)+1);
        

      
      while (mpp.get(nums[j]) >  k){
        mpp.put(nums[i],mpp.get(nums[i])-1);
        i++;
      }
      res = Math.max(res, j-i+1);
      j++;
    }
    return res;
    }
}