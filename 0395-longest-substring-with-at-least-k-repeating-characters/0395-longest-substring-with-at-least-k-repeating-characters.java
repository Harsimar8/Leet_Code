class Solution {
    public int longestSubstring(String s, int k) {
        char[] ans = s.toCharArray();
        
        int maxLen = 0;
        int n = ans.length;
        int res = 0;
        int cnt =0;
        int i =0;
        while(i < n){
            HashMap<Character, Integer> mpp = new HashMap<>();
            for(int j =i; j<n;j++){
                mpp.put(ans[j], mpp.getOrDefault(ans[j],0)+1);
            
            if(isValid(mpp,k)){
                maxLen = Math.max(maxLen, j-i+1);
            }
            }
            i++;
        }
        
        return maxLen;
    }
    public boolean isValid(HashMap<Character,Integer>mpp, int k){
        for(int count : mpp.values()){
            if(count > 0 && count < k){
                return false;
            }

        }
        return true;
    }
}