class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxiLen = 0;
        HashMap<Character , Integer> mpp = new HashMap<>();
        int right = 0;
        int n = s.length();
        int left =0;
        while(right < n){
            
            mpp.put(s.charAt(right), mpp.getOrDefault(s.charAt(right),0)+1);

            while(mpp.get(s.charAt(right)) > 1){
                mpp.put(s.charAt(left),mpp.get(s.charAt(left))-1);
                left++;
            }
            maxiLen = Math.max(maxiLen, right - left +1);
            right++;
        }
        return maxiLen;
    }
}