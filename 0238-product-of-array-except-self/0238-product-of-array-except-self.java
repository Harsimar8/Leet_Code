class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans  = new int[n];
        int left = 1;
        int right = 1;
        Arrays.fill(ans, 1);
        for(int i =1; i<n; i++){
            left *= nums[i-1];
            ans[i] *= left;
        }
        for(int k = n-2; k>=0; k--){
            right *= nums[k+1];
            ans[k] *= right;
        }
        return ans;


    }
}