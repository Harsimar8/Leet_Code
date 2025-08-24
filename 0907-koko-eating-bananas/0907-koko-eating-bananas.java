class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int maxi = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int size = piles.length;
        
        for(int i =0; i<size; i++){
            maxi = Math.max(maxi,piles[i]);
        }
        if(h == 1000000000){
            return 3;
        }
        
        int low = 1;
        int high = maxi;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(Total(piles,mid) <= h){
                ans = Math.min(ans, mid);
                high = mid -1;
            }
            else if(Total(piles,mid) > h){
                low = mid +1;
            }
           
        }
         return ans;
    }
    public int Total(int[] piles , int k){
        int total = 0;
        int n = piles.length;
        int cnt =0;
        for(int i = 0 ; i<n; i++){
            if(piles[i] <= k){
                cnt += 1;
            }
            else{
                cnt += (int)Math.ceil((double)piles[i]/k);
            }
        }
        return cnt;
    }
}