class Solution {
    public int maxScore(int[] card, int k) {
        int lsum = 0;
        int rsum  =0;
        int n = card.length;
        int right =n-1;
        for(int i =0; i<k; i++){
            lsum += card[i];
        }
        int m = k-1;
        int maxi  = lsum;
        int left = k-1;
        while(m >= 0){
            
            lsum -= card[left--];
            rsum += card[right--];
            int cursum = lsum + rsum;
            maxi =  Math.max(maxi, cursum);
            m--;
        }
        return maxi;
    }
}