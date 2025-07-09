class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char charA[] = s.toCharArray();
        char charB[] = t.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);
        int indexs =0;
        int indext =0;
        int start = 0;
        int end =s.length() -1;
        int a = charA.length;
        while(indexs<a && indext <a){
            if(charA[indexs]!= charB[indext]){
                
                return false;
            }
            indexs++;
            indext++;
        }
        return true;
    }
}