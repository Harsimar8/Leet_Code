class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int curr =0;
        int ans = 0;
        for(int i =0; i<n; i++){
            char[] c = bank[i].toCharArray();
            int prev = 0;
            for(int j =0; j<c.length; j++){
                if(c[j] == '1'){
                    prev++;
                }
            }
            if(prev > 0){
                ans += prev * curr;
                curr = prev;
            }
        }
        return ans;
    }
}