class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num : nums){
            st.add(num);
        }
        int longest =0;
        for(int ss: st){
            if(!st.contains(ss-1)){
                int curr = ss;
                int cnt =1;
                while(st.contains(curr+1)){
                    curr++;
                    cnt++;
                } 
                longest = Math.max(longest, cnt);
            }

        }
        return longest;
    }
}