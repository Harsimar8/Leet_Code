class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int[] sort = nums.clone();
        Arrays.sort(sort);
        List<List<Integer>> lst = new ArrayList<>();
        Map<Integer,Integer> mp = new HashMap<>();
         int id = -1;
        for(int  i=0; i<n; i++){
            if(i ==0 || sort[i] - sort[i-1] > limit){
                lst.add(new ArrayList<>());
                id++;
            }
            lst.get(id).add(sort[i]);
            mp.put(sort[i],id);
        }
        
        int[] idx = new int[lst.size()];
        for(int j =0; j<n; j++){
            int cu =mp.get(nums[j]);
            nums[j] = lst.get(cu).get(idx[cu]);
            idx[cu]++;
        }
        return nums;
    }
}