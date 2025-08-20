class Solution {
    public String longestPalindrome(String s) {
    if(s.length() <= 1){
    return s;    
    }
    String maxStr = s.substring(0,1);
    for(int i =0; i<s.length(); i++){
    String odd = expand(s, i , i);
    String even = expand(s, i , i+1);
    
    if(even.length() > maxStr.length()){
    maxStr = even;
    }
    if(odd.length() > maxStr.length()){
    maxStr = odd;
    }
   
    }
     return maxStr;
    }
    public String expand(String s , int left, int right){
    while(left>=0 && right< s.length() && s.charAt(left) == s.charAt(right)){
    left--;
    right++;
    }
    return s.substring(left+1, right);
    }


}