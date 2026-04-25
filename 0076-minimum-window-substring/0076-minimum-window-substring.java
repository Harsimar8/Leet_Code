class Solution {
    public String minWindow(String s, String t) {
        int m = s.length();
        int n = t.length();
        int[] freq = new int[128];
        for(char pl : t.toCharArray()){
            freq[pl]++;
        }
        int start = 0;
        int left =0;
        int mini = Integer.MAX_VALUE;
        int req = n;
        int right = 0;
        while(right < m){
            char ok = s.charAt(right);
            
            if(freq[ok] > 0){
                req--;
            }
            freq[ok]--;
            right++;
            while(req == 0){
                if(right - left < mini){
                    start = left;
                    mini = right - left;
                }

                char pl = s.charAt(left);
                freq[pl]++;
                if(freq[pl] > 0){
                    req++;
                }
                left++;
            }
        }
        return (mini == Integer.MAX_VALUE) ?  "" : s.substring(start, start + mini);
    }
}