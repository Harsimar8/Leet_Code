class Solution {
    public int largestInteger(int[] nums, int k) {
        int[] fx = new int[51];
        int n = nums.length;
        for(int i =0; i<n; i++){
            fx[nums[i]]++;
        }
        int res = -1;
        for(int j =0; j<n; j++){
            if(k == n  || fx[nums[j]] == 1 && (k == 1 || j == 0 || j == n-1)){
                res = Math.max(res, nums[j]);
            }
        }
        return res;
    }
}