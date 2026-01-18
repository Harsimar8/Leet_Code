class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        helper(res,ans, nums, 0);
        return res;
    }
    public void helper(List<List<Integer>> res, List<Integer> ans, int[] nums, int i){
        res.add(new ArrayList<>(ans));
        for(int k =i; k<nums.length; k++){
            ans.add(nums[k]);
            helper(res, ans, nums, k+1);
            ans.remove(ans.size() -1);
        }
    }
}