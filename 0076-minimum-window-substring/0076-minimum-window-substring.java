class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int req = 0;
        int right =0;
        int left =0;
        int[] freq = new int[128];
        for(char ab : t.toCharArray()){
            freq[ab]++;
            req++;
        }
        int start= -1;
        int miniLen = Integer.MAX_VALUE;
        while(right < m){
            char pq = s.charAt(right);
            if(freq[pq] > 0){
                req--;
            }
            freq[pq]--;
            right++;
            while(req == 0){
                char leftChar = s.charAt(left);
                if(right - left < miniLen){
                    start = left;
                    miniLen = right - left;
                }
                freq[leftChar]++;
                if(freq[leftChar] > 0){
                    req++;
                }
                left++;
            }
        }
        return (miniLen == Integer.MAX_VALUE) ? "" : s.substring(start, start + miniLen);
    }
}