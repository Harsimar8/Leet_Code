class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        for(int i =0; i<n; i++){
            char ch = s.charAt(i);
        if(ch == '[' ||  ch == '{' || ch == '('){
            st.push(ch);
        }
        else if(st.isEmpty()){
            return false;
        }
        else{
            char c = st.peek();
            if(ch == ']' && st.peek() == '['){
                st.pop();
            }
            else if(ch == '}' && st.peek() == '{'){
                st.pop();
            }
            else if(ch == ')' && st.peek() == '('){
                st.pop();
            }
            else{
                st.push(ch);
            }

        }
         
        }
        return (st.size() == 0);
    }
}