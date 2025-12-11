class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> mpp = new TreeMap<>();
        int n = s.length();
        
        int[] freq = new int[256];
        
        for(char c : s.toCharArray()){
            freq[c]++;
        }
        
        StringBuilder sb = new StringBuilder();
        List<Character> ans= new ArrayList<>();
        for(int i =0; i<256; i++){
            if(freq[i] > 0){
                int time = freq[i];
                while(time != 0){
                ans.add((char)i);
                time--;
                }
                
            }
        }
        ans.sort((a,b) -> freq[b] - freq[a]);
        for(char aa : ans){
            sb.append(aa);
        }

        
        return sb.toString();
    }
}