class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int m = s.length();
        int n = p.length();
        ArrayList<Integer> ans = new ArrayList<>();
        int cnt =0;
        cnt = n;
        int left =0;
        int[] freq = new int[26];
        int right = 0;
        for(char pp : p.toCharArray()){
            freq[pp - 'a']++;
        }
        while(right < m){
            char ab = s.charAt(right);
            if(freq[ab - 'a'] > 0){
                cnt--;
            }
            freq[ab - 'a']--;
            if(cnt == 0){
                ans.add(left);
            }
            right++;
            if(right - left == p.length()){
                char ac = s.charAt(left);
                if(freq[ac - 'a'] >= 0){
                    cnt++;
                }
                freq[ac - 'a']++;
                left++;
            }

        }

            
        
        return ans;
    }
}