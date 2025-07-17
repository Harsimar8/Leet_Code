class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int n = prices.length;
        for(int i =0; i<n; i++){
            int target = prices[i];
            if(prices[i]  < min){
                min = prices[i];
            }  
            maxi = Math.max(maxi, target -min); 
             
        }
        return maxi;

    }
}