class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        int start = 0;
        int end = s.length() -1;
        if(s.length() <= 1){
            return true;
        }
        while( start <= end  ){
            // if((s1.charAt(start) > 'z' || s1.charAt(start) < 'a') && (s1.charAt(start) > '9' || s1.charAt(start) < '0')){
            //     start++;
            // }
            // if((s1.charAt(end) > 'z' || s1.charAt(end) < 'a') && (s1.charAt(end) > '9' || s1.charAt(end) < '0')){
            //     end--;
            // }
            if(s.charAt(start)!= s.charAt(end)){
                return false;
            }



            start++;
            end--;
        }
        return true;
        
    }
}