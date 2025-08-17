class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        for(int i =0; i<n; i++){
        
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            prefix[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        for(int i =n-1; i>=0; i--){
        while(!st1.isEmpty() && heights[st1.peek()]  > heights[i]){
                st1.pop();
            }
            suffix[i] = st1.isEmpty() ? n : st1.peek();
            st1.push(i);
        }
        int maxArea = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            maxArea = heights[i] * (suffix[i] - prefix[i] - 1);
            maxi = Math.max(maxi, maxArea);
        }
        
        return maxi;

    }
    
}