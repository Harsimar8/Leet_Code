class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int start =s.length() -1;
        
        
        while(start >= 0){
            while(start >= 0  && s.charAt(start) == ' ' ){
                start--;
            }
            if(start < 0){
                break;
            }
            int endInd = start;
            while(start >= 0 && s.charAt(start) != ' ' ){
                start--;
            }
            
            if(res.length() == 0){
                res.append(s.substring(start+1, endInd+1));
            }
            else{
                res.append(' ');
                res.append(s.substring(start+1, endInd+1));
            }
        }
        return res.toString();
    }
}