class Solution {
    public int characterReplacement(String s, int k) {
        int miniLen = Integer.MAX_VALUE;
        int cnt =0;
        int [] freq = new int[26];
        int right =0;
        int left =0;
        int maxiCount = 0;
        int n = s.length();
        int maxi = Integer.MIN_VALUE;
        while(right < n){
            char pl = s.charAt(right);
            freq[pl - 'A']++;
            maxiCount = Math.max(maxiCount, freq[pl - 'A']);
            while((right - left) - maxiCount >= k){
               char leftC = s.charAt(left);
               freq[leftC - 'A']--;
               left++;
            }
            maxi = Math.max(maxi, right - left + 1);
            right++;

        }
        return maxi;
    }
}