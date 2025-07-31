class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
       
       for (int curr : asteroids) {
            boolean destroyed = false;

            while (!st.isEmpty() && curr < 0 && st.peek() > 0) {
                if (st.peek() < -curr) {
                    st.pop(); // Right asteroid is smaller — destroy it
                } else if (st.peek() == -curr) {
                    st.pop(); // Both destroy each other
                    destroyed = true;
                    break;
                } else {
                    destroyed = true; // Current asteroid is smaller — destroy it
                    break;
                }
            }

            if (!destroyed) {
                st.push(curr);
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