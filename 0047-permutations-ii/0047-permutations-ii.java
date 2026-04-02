class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for(int a : nums){
            ans.add(a);
        }
        int n = nums.length;
        Set<List<Integer>> st = new HashSet<>();
        helper(st, res, ans, nums, 0,n);
        return res;

    }
    public void helper(Set<List<Integer>> st, List<List<Integer>> res, List<Integer> ans, int[] nums, int i, int n){
        if(i == n){
            if(!st.contains(ans)){
            res.add(new ArrayList<>(ans));
            st.add(ans);
            }
            return;
        }
        for(int k =i; k<n; k++){
            Collections.swap(ans, i,k);
            helper(st,res,ans, nums, i+1,n);
            Collections.swap(ans, k,i);
        }
    }
    
}