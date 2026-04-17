class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        Arrays.sort(nums);
        helper(nums, 0,ans,res,st);
        return res;
    }
    public void helper(int[] nums, int i, List<Integer> ans, List<List<Integer>> res, Set<List<Integer>> st){
        if(!st.contains(ans)){
        res.add(new ArrayList<>(ans));
        st.add(ans);
        
        }
        for(int k =i; k<nums.length; k++){
            ans.add(nums[k]);
            helper(nums,k+1, ans, res,st);
            ans.remove(ans.size() -1);
        }
    }
}