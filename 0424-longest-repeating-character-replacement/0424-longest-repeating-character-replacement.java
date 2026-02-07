class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int right =0;
        int left =0;
        int maxLen =0;
        int maxCount =0;
        while(right < s.length()){
            freq[s.charAt(right) - 'A']++;
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);

            while((right - left + 1) - maxCount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left +1);
            right++;
        }
        return maxLen;
    }
}