class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() <= 1){
            return false;
        }
        for(char c : s.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                st.add(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char close = c;
                if(close == ')' && st.peek() == '(' || close == '}' && st.peek() == '{' || close == ']' && st.peek() == '['){
                    st.pop();
                } 
                else{
                    return false;
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }    
        return true;
    }
}