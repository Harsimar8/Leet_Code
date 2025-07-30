class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n =asteroids.length;
        for(int i =0; i<n; i++){
            if(asteroids[i] > 0){
                
                st.push(asteroids[i]);
                
            }
            else{
                
                while(!st.isEmpty() && st.peek() > 0 &&  Math.abs(asteroids[i]) > st.peek() ){
                    
                    st.pop();
                }
                
                if(!st.isEmpty() && st.peek() > 0 && Math.abs(asteroids[i]) == st.peek() ){
                    st.pop();
                }
                else if(st.isEmpty() || st.peek()  <0){
                    st.push(asteroids[i]);
                }
                
                
                
                
            }
            
        }
        int[] res = new int[st.size()];
        int i =0;
        while(!st.isEmpty()){
            res[i++] = st.pop();
        }
        
        reverse(res);
        return res;
    }

    public void reverse(int[] res){
        int n = res.length;
        int left =0;
        int right = n-1;
        while(left <= right){
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }

    }
}