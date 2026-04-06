class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
       
        int maxi = 0;
        for(int l =0; l<n; l++){
            maxi = Math.max(maxi, piles[l]);
        }
         int high = maxi;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(helper(piles, mid) <= h){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
           
        }
        return ans;
    }
    public int helper(int[] piles, int k){
        int cnt =0;
        int m = piles.length;
        long total =0;
        for(int j =0; j<m; j++){
            int val = piles[j]/k;
            int cur = piles[j]%k;
            total += val;
            if(cur != 0){
                total += 1;
            }
            
            
        }
        return (int)total;
    }
}