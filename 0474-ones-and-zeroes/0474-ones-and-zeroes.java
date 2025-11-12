class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(String st : strs){
            int zero =0;
            int one =0;
            char[] c = st.toCharArray();
            for(int i =0; i<c.length;i++){
                if(c[i] == '1'){
                    one++;
                }
                else{
                    zero++;
                }
            }
            for(int p = m; p>=zero; p--){
                for(int s = n; s>=one;s--){
                    dp[p][s] = Math.max(dp[p][s],dp[p-zero][s-one] +1);
                }
            }
        }
        return dp[m][n];
    }
}