class Solution {
    Integer[][] memo;

    public int minDistance(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return solve(word1, word2, word1.length(), word2.length());
    }

    private int solve(String s1, String s2, int m, int n) {
        // Base cases: if one string is exhausted, return the length of the other
        
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        if(memo[m][n] != null){
            return memo[m][n];
        }
        int result;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            result = solve(s1,s2,m-1,n-1);
        }
        else{
            int replace = solve(s1,s2,m-1,n-1);
            int delete = solve(s1,s2,m-1,n);
            int insert = solve(s1,s2,m,n-1);

            result = 1 + Math.min(replace, Math.min(delete, insert));
        }

        return memo[m][n] = result;
    }
}