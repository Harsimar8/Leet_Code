class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index =0;
       
        HashMap<Character, Integer> mpp = new HashMap<>();
        int i =0;

        while(i < n){
            char c = chars[i];
            int cnt =0;
            while(i < n && chars[i] == c){
                i++;
                cnt++;
            }
            chars[index++] = c;
            if(cnt > 1){
                for(char p : String.valueOf(cnt).toCharArray()){
                    chars[index++] = p;
                }
            }
        }
        return index;
    }
}