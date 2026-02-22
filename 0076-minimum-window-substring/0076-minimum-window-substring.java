class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int left =0;
        int miniLen = Integer.MAX_VALUE;
        int right =0;
        int n = s.length();
        int req = t.length();
        int start =0;
        while(right < n){
            char cc = s.charAt(right);
            if(freq[cc] > 0){
                req--;
            }
            right++;
            freq[cc]--;
            while(req == 0){
                if(right - left < miniLen){
                    miniLen = right - left;
                    start =left;
                }
                char val = s.charAt(left);
                freq[val]++;
                if(freq[val] > 0){
                    req++;
                }
                left++;
            }
        }
        return miniLen == Integer.MAX_VALUE ? "" : s.substring(start, start + miniLen);
    }
}