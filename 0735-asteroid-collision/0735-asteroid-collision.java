class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> st =new Stack<>();
        for(int curr : asteroids){
            boolean destroy = false;
            while(!st.isEmpty() && curr < 0 && st.peek() > 0){
                if(st.peek() < Math.abs(curr)){
                    
                    st.pop();
                    
                }
                else if(st.peek() == Math.abs(curr)){
                    destroy = true;
                    st.pop();
                    break;
                }
                else{
                    destroy = true;
                    break;
                }
            }
            if(!destroy){
                st.push(curr);
            }
        }
        int[] res = new int[st.size()];
        int i =st.size() -1;
        while(!st.isEmpty()){
            res[i--] = st.pop();
        }
        return res;
    }
}