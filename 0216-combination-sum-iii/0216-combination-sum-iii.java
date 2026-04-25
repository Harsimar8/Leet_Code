class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int ind = 1;
        helper(res, ans, k, n, ind);
        return res;
    }
    public void helper( List<List<Integer>> res, List<Integer> ans, int k, int n, int ind){
        if(n == 0 && ans.size() == k){
            res.add(new ArrayList<>(ans));
            return;
        }
        if(n <0 || k < ans.size()){
            return;
        }
        for(int i = ind; i<=9; i++){
            ans.add(i);
            helper(res, ans, k,n-i, i+1);
            ans.remove(ans.size() -1);
        }
    }
}