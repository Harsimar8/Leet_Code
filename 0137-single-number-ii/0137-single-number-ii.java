class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            mpp.put(nums[i], mpp.getOrDefault(nums[i],0)+1);
        }
        for(int a : mpp.keySet()){
            if(mpp.get(a) == 1){
                return a;
            }
        }
        return -1;
    }
    
}