class Solution {
    public int maxScore(int[] card, int k) {
        int n = card.length;
        int leftSum = 0;
        int rightSum =0;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<k; i++){
            leftSum += card[i];
        }
        maxi = leftSum;
        int right = n-1;
        int left = k-1;
        while(k > 0){
            rightSum += card[right];
            leftSum -= card[left];
            int cur = leftSum + rightSum;
            maxi = Math.max(maxi, cur);
            
            left--;
            right--;
            k--;
        }
        return maxi;
    }
}