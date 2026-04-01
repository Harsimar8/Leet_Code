class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] arr =  new int[n];

        int left  = 1;
        int right = 1;
        Arrays.fill(arr,1);
        for(int k = 1; k<n; k++){
            left *= nums[k-1];
            arr[k] *= left;
        }
        for(int l = n-2; l>=0; l--){
            right *= nums[l+1];
            arr[l] *= right;
        }
        return arr;

    }
}