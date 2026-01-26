class Solution {
    public int trap(int[] height) {
        int total =0;
        int maxi  =0;
        int[] leftMax = prefix(height);
        int[] rightMax = suffix(height);
        int n = height.length;
        for(int i =0; i<n; i++){
            int left = leftMax[i];
            int right = rightMax[i];
            total += Math.min(left, right) - height[i];
        }
        return total;
    }
    public int[] prefix(int[] nums){
        int n = nums.length;
        int[] prefix= new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1], nums[i]);
        }
        return prefix;
    }
    public int[] suffix(int[] nums){
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1], nums[i]);
        }
        return suffix;
    }
}