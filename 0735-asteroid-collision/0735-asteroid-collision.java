class Solution {
    public int[] asteroidCollision(int[] ast) {
        int n = ast.length;
        Stack<Integer> st = new Stack<>();
        for(int a : ast){
            boolean des = false;
            while(!st.isEmpty() && st.peek() > 0 && a < 0){
                if(Math.abs(st.peek()) == Math.abs(a)){
                    st.pop();
                    des = true;
                    break;
                }
                else if(Math.abs(st.peek()) < Math.abs(a)){
                    st.pop();
                    
                    continue;

                }
                else{
                    des = true;
                    break;
                }
            }
            if(!des){
                st.push(a);
            }
        }
        int cnt = st.size();
        int[] ans = new int[cnt];
        for(int k = cnt - 1; k>=0; k--){
            ans[k] = st.pop();
        }
        return ans;
    }
}