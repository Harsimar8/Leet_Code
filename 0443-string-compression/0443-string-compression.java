class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int index =0;
        HashMap<Character,Integer> mpp = new HashMap<>();
        int i =0;
       
        while(i<n){
            char cur = chars[i];
            int count =0;
            while(i<n && chars[i] == cur){
                i++;
                count++;
            }
            chars[index++] = cur;
            if(count > 1){
                for(char c : String.valueOf(count).toCharArray()){
                    chars[index++] = c;
                }
            }
        }
        return index;
    }
}