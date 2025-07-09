class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int indexs = 0;
        int indext =0;
        int[] freq = new int[26];
        int a = s.length();
        while(indexs < a && indext < a){
            char c1 = s.charAt(indexs);
            int freqIndex = c1 - 'a';
            freq[freqIndex] +=1 ;
            char c2 = t.charAt(indext);
            freqIndex = c2 - 'a';
            freq[freqIndex] -= 1;
            indexs++;
            indext++;

        }
        for(int i =0; i<26;i++){
            if(freq[i]!= 0){
                return false;
            }
        }
        return true;
    }
}