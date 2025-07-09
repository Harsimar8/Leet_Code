class Solution {
    public String reverseWords(String s) {
        String ch[] = s.split(" ");
        int start =0;
        int end= s.length() -1;
        String res="";
        for(int i =ch.length-1; i>=0; i--){
            if(ch[i].length() == 0){
                continue;
            }
            if(res.length() == 0){
                res += ch[i];
            }
            else{
                res += " " + ch[i]; 
            }
        }
        return res;
    }
}