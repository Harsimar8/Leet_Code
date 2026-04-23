class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mpp1 = new HashMap<>();
        HashMap<Character, Character> mpp2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(mpp1.containsKey(a)){
                if(mpp1.get(a) != b){
                    return false;
                }
            }
            else{
                mpp1.put(a,b);
            }

             if(mpp2.containsKey(b)){
                if(mpp2.get(b) != a){
                    return false;
                }
            }
            else{
                mpp2.put(b,a);
            }

        }
        return true;
    }

}