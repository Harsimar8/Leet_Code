class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n == 1){
            return 1;
        }
        StringBuilder sb = new StringBuilder(); 
        int i =0;
        int j =0;
        while(i<n){
            int cnt =1;
            for(int k =i+1; k<n;k++){
                if(chars[i] == chars[k]){
                    cnt++;
                    i++;
                }
                else{
                break;
                }
            }
            
            chars[j++] = chars[i];
            if(cnt > 1){
            sb.append(cnt);
            while(sb.length() != 0){
            chars[j++] = sb.charAt(0);
            sb.deleteCharAt(0);
            }
            }
            i++;
            
            
        }
        return j;
    }
}