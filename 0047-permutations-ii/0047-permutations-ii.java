class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res =new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int a : nums){
            ans.add(a);
        }
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        helper(st, res, ans, 0,n);
        return res;
    }
    public void helper(Set<List<Integer>> st, List<List<Integer>> res, List<Integer> ans, int i, int n){
        if(i == n-1){
            if(!st.contains(ans)){
            res.add(new ArrayList<>(ans));
            st.add(ans);
            }
            return;
        }
        for(int k = i; k<n; k++){
            Collections.swap(ans, k,i);
            helper(st,res,ans, i+1,n);
            Collections.swap(ans,i,k);
        }

    }
}