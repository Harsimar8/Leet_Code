class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        char[] arr = s.toCharArray();
        int sum = 0;
        int n = arr.length;
        st.push(0);
        int i =0;
        while(!st.isEmpty()){
            if(i == n){
                break;
            }
            if(arr[i] == '('){
                st.push(0);
            }
            else{
                if(st.size() == 1){
                    break;
                }
                int inner = st.pop();

                if(inner == 0){
                    st.push(st.pop() + 1);
                }
                else{
                    st.push(st.pop() + 2 * inner);
                }
            }
            i++;

        }
        return st.pop();
    }
}