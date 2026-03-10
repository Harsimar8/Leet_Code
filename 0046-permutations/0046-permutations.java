class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int a : nums){
            ans.add(a);
        }
        helper(ans, res, n,0);
        return res;
    }
    public void helper(ArrayList<Integer> ans, List<List<Integer>> res, int n , int i){
        if(i == ans.size()){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int k =i; k<n; k++){
            swap(ans,i,k);
            helper(ans, res, n,i+1);
            swap(ans, i,k);
        }
    }
    public void swap(List<Integer> nums, int i, int j){
        Collections.swap(nums,i,j);
    }
}