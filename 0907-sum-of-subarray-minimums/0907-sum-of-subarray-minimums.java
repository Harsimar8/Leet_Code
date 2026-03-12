class Solution {
    public int count =0;
    public int sumSubarrayMins(int[] arr) {
     long sum =0;
     Stack<Integer> st1 = new Stack<>();
     Stack<Integer> st2 = new Stack<>();

     int n = arr.length;
     int[] pre = new int[n];
     int[] suf = new int[n];
     for(int i =0; i<n; i++){
        while(!st1.isEmpty() && arr[st1.peek()] >= arr[i]){
            st1.pop();
        }
        pre[i] = (st1.isEmpty()) ? -1 : st1.peek();
        st1.push(i);
     }
     for(int i =n-1; i>=0; i--){
        while(!st2.isEmpty() && arr[st2.peek()] > arr[i]){
            st2.pop();
        }
        suf[i] = (st2.isEmpty()) ? n : st2.peek();
        st2.push(i);
     }
     int lod = (int)1e9 + 7;
     for(int k =0; k<n; k++){
        long pp = k - pre[k];
        long oo = suf[k] - k;

        sum  = (sum + (long)arr[k] * pp % lod * oo % lod) % lod;
     }
     return (int)sum;
    }
   
}