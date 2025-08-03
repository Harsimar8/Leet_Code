class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);

        }
        int cnt =0;
        int longest = 0;
        for(int ss : st){
            if(!st.contains(ss -1)){
                int cur = ss;
                cnt= 1;
                while(st.contains(cur+1)){
                    
                    cnt++;
                    cur++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}