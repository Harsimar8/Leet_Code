class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int evenIn = 0;
        int oddIn = 1;
        for(int i =0; i<n;i++){
            if(nums[i] >= 0){
                ans[evenIn] = nums[i];
                evenIn+=2;
            }
            else{
                ans[oddIn] = nums[i];
                oddIn+=2;
            }
        }
        return ans;
    }
}