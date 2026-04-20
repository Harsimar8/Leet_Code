class Solution {
    public int candy(int[] ratings) {
        int total  =0;
        int n = ratings.length;
        int[] ans = new int[n];
        Arrays.fill(ans,1);
        for(int i = 1; i<n; i++){
            if(ratings[i-1] < ratings[i]){
                ans[i] = ans[i-1] +1;
            }
        }
        for(int k = n-2; k>=0; k--){
            if(ratings[k+1] < ratings[k]){
                if(ans[k] > ans[k+1]){
                    continue;
                }
            ans[k] = ans[k+1] +1;
            }
        }
        for(int num : ans){
            total += num;
        }
        return total;
    }
}