class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 0;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(int a : nums){
            mini = Math.min(mini, a);
            maxi = Math.max(maxi,a);
        }
        low = 1;
        int high = maxi;
        int ans =-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(helper(nums, threshold,mid) <= threshold){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public int helper(int[]nums, int th, int div){
        int total =0;
        int val =0;
        int cur =0;
        for(int i =0; i<nums.length; i++){
            val = nums[i]/div;
            cur = nums[i]%div;
            total += val;
            if(cur != 0){
                total++;
            }
        }
        return total;
    }
}