class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        HashMap<Character, Integer> mpp = new HashMap<>();
        int right =0;
        int n = s.length();
        int maxiLen = Integer.MIN_VALUE;
        int left =0;
        int maxCount  =0;
        while(right < n){
            freq[s.charAt(right) - 'A']++;
            
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']);
            while((right - left + 1) - maxCount > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxiLen = Math.max(right - left + 1, maxiLen);
            right++;
        }
        return maxiLen;
    }
}