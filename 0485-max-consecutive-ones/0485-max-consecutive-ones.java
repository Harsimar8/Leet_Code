class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int j =0;
        int count =0;
        
        for(int i =0; i<n; i++){
            
            if(nums[i] == 1){
                count++;
                maxi = Math.max(maxi , count);
                
            }
            else{
                count=0;
            }
            

        }
        return (maxi != Integer.MIN_VALUE) ? maxi : 0;
        
    }
}