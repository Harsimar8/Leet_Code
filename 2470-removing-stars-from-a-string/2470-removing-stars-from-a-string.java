class Solution {
    public String removeStars(String s) {
        char[] ans = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i =0;
        int n = ans.length;
        while(i < n){
            if(ans[i] != '*'){
                st.push(ans[i]);
            }
            else{
                st.pop();
            }
            i++;
        }
        while(!st.isEmpty()){
            char c = st.pop();
            sb.append(c);
        }
        sb.reverse();
        return sb.toString();
    }
}