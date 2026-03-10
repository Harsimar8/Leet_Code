class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int req = t.length();
        int right = 0;
        int left =0;
        int mini = Integer.MAX_VALUE;
        int n = s.length();
        char[] ans = s.toCharArray();
        int start =0;
        while(right < n){
            char val = ans[right];
            freq[val]--;
            if(freq[val] >= 0){
                req--;
            }
            right++;
            while(req == 0){
                if((right - left) < mini){
                    mini = right - left;
                    start = left;
                }
                char ss = ans[left];
                freq[ss]++;
                if(freq[ss] > 0){
                    req++;
                }
                left++;
            }
        }
        return mini == Integer.MAX_VALUE ? "" : s.substring(start, start + mini);
    }
}