class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int[] freq = new int[26];
        int left =0;
        int right =0;
        for(int i =0; i<p.length(); i++){
            freq[p.charAt(i) - 'a']++;
        }
        int count = p.length();
        while(right < s.length()){
            

            if(freq[s.charAt(right) - 'a'] > 0){
                count--;
            }
            if(count == 0){
                ans.add(left);

            }
            freq[s.charAt(right) - 'a']--;
            right++;
            if(right - left == p.length()){
                

                if(freq[s.charAt(left) - 'a'] >=0){
                    count++;
                }
                freq[s.charAt(left) - 'a']++;
                left++;
            }
            

        }
        return ans;
    }
}