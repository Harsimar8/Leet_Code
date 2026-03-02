class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() -1;
        int j = t.length() -1;
        int ss =0;
        int tt =0;

        while(i >=0 || j >=0 ){
        while(i>=0){
            if(s.charAt(i) == '#'){
                ss++;
                i--;
            }
            else if(ss > 0){
                ss--;
                i--;
            }
            else{
                break;
            }
        }

        while(j>=0){
            if(t.charAt(j) == '#'){
                tt++;
                j--;
            }
            else if(tt > 0){
                tt--;
                j--;
            }
            else{
                break;
            }
        }

        if(i >=0 && j >=0 ){
            if(s.charAt(i) != t.charAt(j)){
                return false;
            }
        }
        else{
            if(i >=0 || j>=0){
                return false;
            }
        }
        i--;
        j--;

    }
    return true;
    }
}