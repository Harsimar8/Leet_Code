class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] freq = new int[26];
       
        int cnt =p.length();
        int right =0;
        int n = s.length();
        int left =0;
        for(char pp : p.toCharArray()){
            freq[pp -'a']++;
            
        }
        List<Integer> ans = new ArrayList<>();
        while(right < n){
            if(freq[s.charAt(right)-'a'] > 0){
                cnt--;
            } 
            
            freq[s.charAt(right) - 'a']--;
            if(cnt == 0){
                ans.add(left);
            }
            
             right++;
            if(right - left == p.length()){
                if(freq[s.charAt(left) - 'a'] >= 0){
                    cnt++;
                }
                
                freq[s.charAt(left) - 'a']++;
                left++;
            }
           
        }
        return ans;
    }
}