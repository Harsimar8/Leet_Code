class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;
        int n = nums.length;
        for(int i =0; i<n; i++){
            for(int j =i; j<n; j++){
                int ans = nums[j] - nums[i];
                if(Math.abs(ans) == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}