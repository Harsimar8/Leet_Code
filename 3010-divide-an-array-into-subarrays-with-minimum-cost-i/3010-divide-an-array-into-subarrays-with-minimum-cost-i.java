class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        
        int one = nums[0];
        int mini = Integer.MAX_VALUE;
        for(int i =1; i<n; i++){
            for(int j =i+1; j<n; j++){
                
                    mini = Math.min(mini,one+nums[i]+nums[j]);
                
            }
        }
        return mini;
    }
}