class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            ArrayList<Integer> ok = helper(nums[i]);
            for(int a : ok){
                ans.add(a);
            }
        }
        int[] pak = new int[ans.size()];
        for(int k =0; k< pak.length; k++){
            pak[k] = ans.get(k);
        }
        return pak;

    }
    public ArrayList<Integer> helper(int val){
        ArrayList<Integer> res = new ArrayList<>();
        while(val != 0){
            int last = val % 10;
            res.add(last);
            val/=10;
        }
        Collections.reverse(res);
        return res;
    }
}