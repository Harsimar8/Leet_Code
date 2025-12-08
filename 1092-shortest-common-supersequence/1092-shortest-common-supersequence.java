class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length(); 
        int i =m;
        int j = n;
        int[][] dp = new int[m+1][n+1];
        for(int r = 1; r <=m; r++){
            for(int s = 1; s <=n; s++){
                if(str1.charAt(r-1) == str2.charAt(s-1)){
                    dp[r][s]= 1 + dp[r-1][s-1]; 
                }
                else{
                    dp[r][s] = Math.max(dp[r-1][s], dp[r][s-1]);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while( i > 0 && j > 0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]){
                sb.append(str1.charAt(i-1));
                i--;
            }
            else{
                sb.append(str2.charAt(j-1));
                j--;
            }
        }
        while( i > 0){
            sb.append(str1.charAt(i-1));
            i--;
        }
        while(j > 0){
            sb.append(str2.charAt(j-1));
                j--;
        }
        return sb.reverse().toString();
    }
}