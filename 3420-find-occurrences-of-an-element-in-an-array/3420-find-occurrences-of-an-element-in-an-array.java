class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> list = new ArrayList<>();
        
        int n = nums.length;
        for(int i =0; i<n;i++){
            if(x == nums[i]){
                list.add(i);
            }
        }
        int k =0;
        int j =0;
        int q = queries.length;
        int[] ans = new int[q];
        for(int i =0; i<q; i++){
            int ele = queries[i];
            if(ele > list.size()){
                ans[k++] = -1;
            }
            else if(ele <= list.size()){
                if( k <= q-1){
                ans[k++] = list.get(ele-1);
                }
            }
        }
        return ans;
    }
}