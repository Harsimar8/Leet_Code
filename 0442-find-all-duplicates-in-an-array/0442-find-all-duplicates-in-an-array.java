class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        for(int i =0; i<n; i++){
            int ele = Math.abs(nums[i]);
            int correctPos = ele -1;
            if(nums[correctPos] < 0){
                res.add(Math.abs(nums[i]));
            }
            else{
                nums[correctPos] = -1 * nums[correctPos];
            }
        }
        return res;
    }
}