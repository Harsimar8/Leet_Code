class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n  = arr.length;
        int[] prefix = new int[n];
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();


        for(int i =0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            prefix[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(i);
        }
         int[] suffix = new int[n];
        for(int i =n-1; i>=0; i--){
             while(!st1.isEmpty() && arr[st1.peek()] > arr[i]){
                st1.pop();
            }
            suffix[i] = (st1.isEmpty()) ? n : st1.peek();
            st1.push(i);
        }
        long sum =0;
        int MODE = (int)1e9 + 7;
        for(int i =0; i<n;i++){
            long pp = i-prefix[i];
            long rr = suffix[i]-i;
            sum  = (sum + (long)arr[i] * pp % MODE * rr % MODE)%MODE;
            if( sum < 0){
                sum += MODE;
            }
        }
        return (int)sum;
    }
}