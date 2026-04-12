class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String pref = strs[0];
        int prefLen = pref.length();
        for(int i =1; i<strs.length; i++){
            String s = strs[i];

            while(prefLen > s.length() || !pref.equals(s.substring(0,prefLen))){
                prefLen--;
                if(prefLen == 0){
                    return "";
                }
                pref = pref.substring(0, prefLen);
            }
        }
        return pref;
    }
}