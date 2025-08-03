class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        int longest =0;
        for(int ss : nums){
            st.add(ss);
        }
        for(int num : st){
            if(!st.contains(num-1)){
                int cur = num;
                int cnt =1;
                while(st.contains(cur+1)){
                    cur++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}