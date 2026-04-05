class Solution {
    public int maxArea(int[] height) {
        int maxA =0;
        int left =0;
        int right = height.length -1;
        while(left < right){
            int width = right - left;
            int current_height = Math.min(height[right], height[left]);
            int area = width * current_height;
            maxA = Math.max(maxA, area);
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxA;
    }
}