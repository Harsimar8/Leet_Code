class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        int cnt =0;
        for(int i =0; i<ch.length; i++){
            if( ch[i] == '[' || ch[i] == ']'  && st.isEmpty()){
                st.push(ch[i]);
            }
            else if(ch[i] == ']' && st.peek() == '['){
                st.pop();
            }
        }
        if(st.isEmpty()){
            return 0;
        }
        return st.size()/2;
    }
}