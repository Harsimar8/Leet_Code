class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mp1 = new HashMap<>();
        HashMap<Character, Character> mp2 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i =0; i<s.length(); i++){
            char a = s.charAt(i);
            char b = t.charAt(i);

            if(mp1.containsKey(a)){
                if(mp1.get(a) != b) return false;
            }
            else{
                mp1.put(a,b);
            }

            if(mp2.containsKey(b)){
                if(mp2.get(b) != a) return false;
            }
            else{
                mp2.put(b,a);
            }


        }
        return true;
    }
}