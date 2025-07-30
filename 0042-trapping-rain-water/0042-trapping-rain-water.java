class Solution {
    public int trap(int[] height) {
        int total =0;
        int n = height.length;
        int[] leftMax = prefixMax(height);
        int[] rightMax = suffixMax(height);
        for(int i =0; i<n; i++){
            int left = leftMax[i];
            int right = rightMax[i];

            if(height[i] < left && height[i] < right){
                total += Math.min(left ,right) - height[i];
            }
        }
        return total;
    }
    public int[] prefixMax(int[] arr){
        int n= arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i =1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1] , arr[i]);
        }
        return prefix;
    }
    public int[] suffixMax(int[] arr){
        int n= arr.length;
        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = Math.max(suffix[i+1] , arr[i]);
        }
        return suffix;
    }


}