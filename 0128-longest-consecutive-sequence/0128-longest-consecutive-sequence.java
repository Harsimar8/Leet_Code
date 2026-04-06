class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> st = new HashSet<>();
        for(int a : nums){
            st.add(a);
        }
        int maxi = 0;
        int cnt =0;
        for(int ni : st){
            if(!st.contains(ni - 1)){
                int ele = ni;
                cnt =0;
                while(st.contains(ele)){
                    cnt++;
                    ele++;
                }
                maxi = Math.max(cnt, maxi);
            }
        }
        return maxi;
    }
}