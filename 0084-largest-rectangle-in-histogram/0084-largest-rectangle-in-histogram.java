class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxi =0;
        int n = heights.length;
        if(n == 1){
            return heights[0];
        }
        Stack<Integer> st = new Stack<>();
        for(int i =0; i<=n; i++){
            int curr = (i == n) ? 0: heights[i];
            while(!st.isEmpty() && curr <= heights[st.peek()]){
                int he = heights[st.pop()];
                int right = i;
                int left = (st.isEmpty()) ? -1 : st.peek();
                int width = right - left - 1;
                maxi = Math.max(maxi, he * width); 
            }
            st.push(i);
        }
        return maxi;
    }
}