class Solution {
    public int singleNumber(int[] nums) {
        
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        HashMap<Integer,Integer> mpp = new HashMap<>(maxi+1);
        
        for(int i =0; i<n; i++){
            mpp.put(nums[i] , mpp.getOrDefault(nums[i] , 0) +1);
            
        }
        for(int i =0; i<n; i++){
            if(mpp.getOrDefault(nums[i],0) == 1){
                return nums[i];
                
            }
        }
        return 0;
        
    }
}