class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int left = 1;
        int right =1;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        for(int i =1; i<n; i++){
            left *= nums[i-1];
            arr[i] *= left;
        }
        for(int k = n-2; k>=0; k--){
            right *= nums[k+1];
            arr[k] *= right;
        }
        return arr;
    }
}