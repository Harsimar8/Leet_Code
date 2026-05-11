class Solution {
    public int trap(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right= new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];

        for(int i =1; i<n; i++){
            left[i] = Math.max(left[i-1], nums[i]);
        }
        for(int k = n-2; k>=0; k--){
            right[k] = Math.max(right[k+1], nums[k]);
        }
        int total = 0;
        for(int j = 1; j<=n-2; j++){
            int val = Math.min(left[j], right[j]);
            total += val - nums[j];
        }
        return total;
    }
}