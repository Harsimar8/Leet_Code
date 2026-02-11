class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        if(goal < 0){
            return 0;
        }
        return atmost(nums,goal) - atmost(nums,goal-1);
    }

    public int atmost(int[] nums, int goal){
        if(goal < 0){
            return 0;
        }
        int n = nums.length;
        int cnt =0;
        int left =0;
        int sum =0;
        for(int right =0; right<n; right++){
            sum += nums[right];
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            cnt += (right-left+1);
        }
        return cnt;
    }
}