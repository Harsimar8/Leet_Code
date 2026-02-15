class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        for(char c : t.toCharArray()){
            freq[c]++;
        }
        int right =0;
        int left =0;
        int start =0;
        int minLen  = Integer.MAX_VALUE;
        int required = t.length();
        while(right < s.length()){
            char c = s.charAt(right);
            if(freq[c] > 0){
                required--;
            }
            freq[c]--;
            right++;
        
        while(required == 0){
            if(right - left < minLen){
                minLen = right - left;
                start = left;
            }
            char leftC = s.charAt(left);
            freq[leftC]++;
            if(freq[leftC] > 0){
                required++;
            }
            
            left++;
        }
    }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}