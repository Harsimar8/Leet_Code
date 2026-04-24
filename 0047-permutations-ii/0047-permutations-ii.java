class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        for(int a : nums){
            ans.add(a);
        }
        helper( res, ans, st, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> ans, Set<List<Integer>> st, int i){
        if(i == ans.size()){
            if(!st.contains(ans)){
                res.add(new ArrayList<>(ans));
                st.add(ans);
                return;
            }
        }
        for(int k =i; k<ans.size(); k++){
            Collections.swap(ans, k,i);
            helper(res,ans, st, i+1);
            Collections.swap(ans, i,k);
        }
    }
}