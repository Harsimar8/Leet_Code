class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int s = 1;
        int maxi =0;
        for(int i =0; i<n; i++){
            maxi = Math.max(maxi, piles[i]);
        }
        int e = maxi;
        int ans =0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(isPossible(piles,mid, h)){
                ans = mid;
                e = mid - 1;
            }
            else{
                s = mid +1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] nums, int k, int h){
        int total =0;
        for(int i =0; i<nums.length; i++){
            total += nums[i]/k;
            if(nums[i]%k != 0){
                total += 1;
            }
            if(total > h){
                return false;
            }
        }
        
        return true;
    }
}