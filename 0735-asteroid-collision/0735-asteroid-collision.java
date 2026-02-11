class Solution {
    public int[] asteroidCollision(int[] nums) {
        Stack<Integer> st = new Stack<>();
        for(int a : nums){
            boolean des = false;
            while(!st.isEmpty() && a < 0 && st.peek() > 0){
                if(Math.abs(a) == st.peek()){
                    st.pop();
                    des = true;
                    break;
                }
                else if(Math.abs(a) < st.peek()){
                    des = true;
                    break;
                }
                else{
                    
                    st.pop();
                    
                }
            }
            if(!des){
                st.push(a);
            }
        }
        int cnt = st.size();
        int[] ans = new int[cnt];
        for(int i =cnt-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}