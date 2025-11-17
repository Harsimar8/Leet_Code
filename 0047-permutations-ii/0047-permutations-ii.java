class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visi = new boolean[nums.length];
        List<Integer> cur = new ArrayList<>();
        back(st,ans,nums,visi,cur);
        for(List<Integer> a : st){
            ans.add(a);
        }
        return ans;
    }
    public void back(Set<List<Integer>> st, List<List<Integer>> ans, int[] nums ,boolean[] visi,List<Integer> cur){
        if(cur.size() == nums.length){
            st.add(new ArrayList<>(cur));
            return;
        }
        for(int i =0; i<nums.length; i++){
            if(visi[i]){
                continue;
            }
            visi[i] = true;
            cur.add(nums[i]);
            back(st,ans,nums,visi,cur);
            visi[i] = false;
            cur.remove(cur.size() -1);
        }
    }
}