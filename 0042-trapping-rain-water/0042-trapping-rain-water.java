class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        left[0] = height[0];
        Stack<Integer> st = new Stack<>();
        int idx =0;
        int[] right = new int[n];
        right[n-1] = height[n-1];
        int res =0;
        for(int k =1; k<n; k++){
            left[k] = Math.max(left[k-1], height[k]);
        }
        for(int m = n-2; m>=0; m--){
            right[m] = Math.max(right[m+1], height[m]);
        }
        for(int i =0; i<n; i++){
             
            res += Math.min(left[i],right[i]) - height[i];
        }
        return res;
    }
}