class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int maxi  = 0;
        for(int a : piles){
            maxi = Math.max(maxi,a);
        }
        int high= maxi;
        int ans =-1;
        while( low <= high){
            int mid = (low + high)/2;
            if(mini(piles,h,mid) <= h){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public int mini(int[] piles, int h, int k){
        int total  =0;
        for(int i =0; i<piles.length;i++){
            int val = piles[i]/k;
            int cur = piles[i] %k;
            total += val;
            if(cur != 0){
                total += 1;
            }
            if(total > h){
                break;
            }
        }
        return total;

    }
}