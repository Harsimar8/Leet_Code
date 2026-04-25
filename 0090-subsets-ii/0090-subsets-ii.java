class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        helper(nums, st, res, ans, 0);
        return res;
    }
    public void helper(int[] nums, Set<List<Integer>> st, List<List<Integer>> res, List<Integer> ans, int ind){
        if(!st.contains(ans)){
            res.add(new ArrayList<>(ans));
            st.add(ans);
        }
        for(int k = ind; k<nums.length; k++){
            ans.add(nums[k]);
            helper(nums, st, res, ans, k+1);
            ans.remove(ans.size() -1);
        }
    }
}