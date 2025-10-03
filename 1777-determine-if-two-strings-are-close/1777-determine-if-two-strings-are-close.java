class Solution {
    public boolean closeStrings(String word1, String word2) {
        int n1 = word1.length() -1;
        int n2 = word2.length() -1;
        if(n2 > n1){
            return false;
        }
        int[] fre = new int[26];
        int[] fre1 = new int[26];
        for(char c : word1.toCharArray()){
            fre[c - 'a']++;
        }
        for(char c : word2.toCharArray()){
            fre1[c - 'a']++;
        }
        for(int i =0; i<26;i++){
            if(fre[i] == 0 && fre1[i] != 0 || fre1[i] == 0 && fre[i] != 0){
                return false;
            }
        }
        Arrays.sort(fre);
        Arrays.sort(fre1);
        for(int i =0; i<26; i++){
            if(fre[i] != fre1[i]){
                return false;
            }
        }
        return true;
    }
}