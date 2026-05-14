class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            String val = String.valueOf(nums[i]);
            for(char ok : val.toCharArray()){
                ans.add(ok - '0');
            }
        }
        int[] res= new int[ans.size()];
        for(int k =0; k<ans.size(); k++){
            res[k] = ans.get(k);
        }
        return res;
    }
}