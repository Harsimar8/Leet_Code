class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);

        }
        int low =1;
        int high = maxi;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(nums,mid) <= threshold){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public int isPossible(int[] nums, int mid){
        int res = 0;
        int n = nums.length;
        for(int i =0;i<n; i++){
            res += (int)Math.ceil((double)nums[i]/mid);
        }
        return res;
    }
}