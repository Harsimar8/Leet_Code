class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[128];
        int m = s.length();
        int n = t.length();
        int req = 0;
        for(char ab : t.toCharArray()){
            freq[ab]++;
            req++;
        }   
        int right =0;
        int left =0;
        int mini = Integer.MAX_VALUE;
        int start = 0;
        
        while(right < m){
            
            if(freq[s.charAt(right)] > 0){
                req--;
            }
            freq[s.charAt(right)]--;
            right++;
            while(req == 0){
                if((right - left) < mini){
                    mini = right - left;
                    start = left;
                }
                char close = s.charAt(left);
                freq[close]++;
                if(freq[close] > 0){
                    req++;
                }
                left++;
            }
        }
        return (mini == Integer.MAX_VALUE) ? "" : s.substring(start, start + mini);
    }
}