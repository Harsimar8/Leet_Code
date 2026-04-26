class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        s =s.trim();
        String[] arr = s.split("\\s+");
        
        int m = arr.length;
        StringBuilder sb = new StringBuilder();
        for(int k = m-1; k>=0; k--){
            sb.append(arr[k]);
            if(k != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}