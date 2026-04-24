class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftM = new int[n];
        int[] rightM = new int[n];
        leftM[0] = height[0];
        for(int i =1; i<n; i++){
            leftM[i] = Math.max(height[i], leftM[i-1]);
        }
        rightM[n-1] = height[n-1];
        for(int j = n-2; j>=0; j--){
            rightM[j] = Math.max(height[j], rightM[j+1]);
        }
        int total =0;
        for(int k =1; k<n-1; k++){
            int val = Math.min(leftM[k], rightM[k]);
            int car = Math.abs(height[k] - val);
            total += car;
        }
        return total;
    }
}