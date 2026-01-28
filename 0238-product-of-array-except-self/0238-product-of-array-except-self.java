class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        for(int i =0; i<n; i++){
            int val = res[i] * left;
            res[i]  = left;
            left *= nums[i];
        }
        int right =1;
        for(int j = n-1; j>=0; j--){
            int val = res[j] * right ;
            res[j] = val;
            right *= nums[j];
        }
        return res;
    }
}