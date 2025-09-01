class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int n = s.length();
        int l=0;
        if(n == 0){
            return 0;
        }
        int maxi = Integer.MIN_VALUE;
        for(int r = 0; r<n; r++){
            while(l < r && st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxi = Math.max(maxi, r-l+1);
        }
         return maxi;
    }
   

}