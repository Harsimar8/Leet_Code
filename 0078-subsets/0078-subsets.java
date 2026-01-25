class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        int total  = 1 << n;
        for(int num = 0; num < total; num++){
            List<Integer> ans = new ArrayList<>();
            for(int i =0; i<n; i++){
                if((num & (1 << i)) != 0){
                    ans.add(nums[i]);
                }
            }
            res.add(ans);
        }
        return res;
    }

}