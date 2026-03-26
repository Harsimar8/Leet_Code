class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int n = s.length();
        int m = p.length();
        int right= 0;
        int cnt = m;
        int[] freq = new int[26];
        for(int i =0; i<m; i++){
            freq[p.charAt(i) - 'a']++;
        }
        int left =0;
        
        while(right < n){
            if(freq[s.charAt(right) - 'a'] > 0){
                cnt--;
            }
            freq[s.charAt(right) - 'a']--;
            if(cnt == 0){
                ans.add(left);
            }
            right++;
            if(right - left == p.length()){
                if(freq[s.charAt(left) -'a'] >= 0){
                    cnt++;
                }
                freq[s.charAt(left) - 'a']++;
                left++;
            }

            
        }
        return ans;
    }
}