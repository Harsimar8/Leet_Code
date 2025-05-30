class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int maxC =0;
        for(int num : nums){
            if(num == 1){
                count++;
                maxC= Math.max(count , maxC);
            }
            else{
                count=0;
            }
        }
        return maxC;
    }
}