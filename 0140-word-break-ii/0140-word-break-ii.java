class Solution {
    public List<String> ans;
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet<>();
        int n = wordDict.size();
        ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            st.add(wordDict.get(i));
        }
        List<String> path = new ArrayList<>();
        helper(0, s,st,path);
        return ans;
    }
    public void helper(int idx, String s, Set<String> st , List<String> path){
        if(idx == s.length()){
            StringBuilder sb = new StringBuilder();
            for(int i =0; i<path.size(); i++){
                sb.append(path.get(i));
                if(i!= path.size() -1){
                    sb.append(" ");
                }
            }
            ans.add(sb.toString());
            return;
        }
        String word = "";
        for(int i =idx; i<s.length(); i++){
            word += s.charAt(i);
            if(st.contains(word)){
                path.add(word);
                helper(i+1, s, st, path);
                path.remove(path.size() -1);
            }
        }
    }
}