class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        helper(s, res, ans, 0);
        return res;
    }
    public void helper(String s, List<List<String>> res, List<String> ans,  int i){
        if(i == s.length()){
            res.add(new ArrayList<>(ans));
            
            return;
        }
        for(int j =i; j<s.length(); j++){
            if(isPalin(s,i,j)){
            ans.add(s.substring(i,j+1));
            helper(s,res,ans,j+1);
            ans.remove(ans.size() -1);
            }
        }
    }
    public boolean isPalin(String s, int left, int right){
        if(s.length() == 1){
            return true;
        }
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}