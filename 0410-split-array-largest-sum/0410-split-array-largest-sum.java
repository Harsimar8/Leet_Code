class Solution {
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int i =0; i<n; i++){
            maxi = Math.max(maxi, nums[i]);
            sum += nums[i];
        }
        int ans = 0;
        int low = maxi;
        int high = sum;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(countPart(nums,mid) <= k){
                ans = mid;
                high = mid -1;
            }
            
            else{
                low = mid + 1;
            }
            
        }
        return ans;
    }
    public int countPart(int[] nums, int mid){
        int sub = 0;
        int partition = 1;
        int n = nums.length;
        for(int i =0; i<n; i++){
            if(sub+ nums[i] <= mid){
                sub += nums[i];
            }
            else{
                partition++;
                sub = nums[i];
            }
        }
        return partition;
    }
}