class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open = n;
        int close =n;
        String op= "";
        helper(open, close, op,ans);
        return ans;
    }
    public void helper(int open, int close, String op, List<String> ans){
        if(open == 0 && close ==0){
            ans.add(op);
            return;
        }
        if(open != 0){
            String res = op;
            res += "(";
            helper(open-1,close, res, ans);

        }
        if(close > open){
            String res1 = op;
            res1 += ")";
            helper(open,close-1, res1, ans);
        }
        return;
    }
}