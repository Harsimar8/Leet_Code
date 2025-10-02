class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        int maxLen = 0;
        int left =0;
        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            mpp.put(c, mpp.getOrDefault(c,0)+1);

            while(mpp.get(c) > 1){
                char leftChar = s.charAt(left);
                mpp.put(leftChar, mpp.get(leftChar) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);

        }
        return maxLen;
        
    }
}