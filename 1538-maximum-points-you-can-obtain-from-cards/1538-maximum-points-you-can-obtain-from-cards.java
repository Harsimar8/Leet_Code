class Solution {
    public int maxScore(int[] card, int k) {
        int lsum =0;
        int rsum =0;
        int n = card.length;
        int r = n-1;
        int j = k-1;
        while(j>=0){
            lsum += card[j];
            j--;
        }
        int m = k-1;
        int maxi = lsum;
        while(m>=0){
            int curSum =0;
            lsum -= card[m];
            rsum += card[r];
            m--;
            r--;
            curSum = lsum + rsum;
            maxi = Math.max(maxi, curSum);

        }
        return maxi;
    }
}