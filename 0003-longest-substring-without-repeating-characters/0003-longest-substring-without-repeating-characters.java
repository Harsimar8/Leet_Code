class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> mpp = new HashMap<>();
        int maxiLen =0;
        int right = 0;
        int n = s.length();
        int left =0;
        int[] freq = new int[26];
        int maxi =0;
        while(right < n){
            char ch = s.charAt(right);
            mpp.put(ch, mpp.getOrDefault(ch,0)+1);

            while(mpp.get(ch) > 1){
                char c = s.charAt(left);
                mpp.put(c,mpp.get(c) -1);
                left++;
            }
            maxi = Math.max(maxi, right - left+1);
            right++;
        }
        return maxi;
    }
}