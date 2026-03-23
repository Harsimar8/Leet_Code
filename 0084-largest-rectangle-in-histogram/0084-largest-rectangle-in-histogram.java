class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] left = new int[n];
        int[] right = new int[n];
        
        int idx =0;
        int idd =0;
       
        Stack<Integer> st1 = new Stack<>();
        for(int i =0; i<n; i++){
            while(!st1.isEmpty() && heights[st1.peek()] >= heights[i]){
                st1.pop();
            }
            int val = (st1.isEmpty()) ? -1 : st1.peek();
            left[idx++] = val;
            st1.push(i);
        }
        Stack<Integer> st2 = new Stack<>();
        for(int i =n-1; i>=0; i--){
            while(!st2.isEmpty() && heights[st2.peek()] > heights[i]){
                st2.pop();
            }
            int val = (st2.isEmpty()) ? n : st2.peek();
            right[i] = val;
            st2.push(i);
        }
        int res = 0;
        for(int i =0; i<n; i++){
            int val = left[i];
            int cur = right[i];
            int sum = heights[i] * (cur - val - 1);
            res = Math.max(res, sum);
        }
        return res;

    }
}