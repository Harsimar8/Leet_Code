class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char cs[] = s.toCharArray();
        char ct[] = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        int indexs =0;
        int indext =0;
        int a = cs.length ;
        while(indexs <a && indext <a){
            if(cs[indexs]!= ct[indext]){
                return false;
            }
            indexs++;
            indext++;
        }
        return true;
    }
}