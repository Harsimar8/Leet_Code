class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Set<List<Integer>> st = new HashSet<>();
        helper(st,res, ans, nums, target, 0);
        return res;
    }
    public void helper(Set<List<Integer>> st, List<List<Integer>> res, List<Integer> ans,  int[] nums, int sum, int i){
        if(sum == 0){
           if(!st.contains(ans)){
            res.add(new ArrayList<>(ans));
            st.add(ans);
           }
            
            return;
        }
        for(int j =i; j<nums.length; j++){
            if(sum - nums[j] >= 0){
                ans.add(nums[j]);
                
                helper(st,res,ans,nums,sum-nums[j],j);
                ans.remove(ans.size() -1);
            }
            // if(sum != 0){
            // helper(st,res,ans,nums,sum,j+1);
            // }
            
            

        }
    }
}