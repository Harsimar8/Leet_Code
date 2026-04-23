class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
       
        if(n< m){
            return false;
        }
        int i =0;
        int j =0;
        
        while(i<m){
            char val = s.charAt(i);
            boolean found = false;
            while(j<n){
                if(t.charAt(j) == val){
                    found = true;
                    j++;
                    break;
                }
                j++;
            }
            if(!found){
                return false;
            }
            i++;
            if(j ==n && i !=m ){
                return false;
            }
        }
        return true;
    }
}