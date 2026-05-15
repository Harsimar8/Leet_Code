class Solution {
    public int findMin(int[] nums) {
        int n  = nums.length;
        int mini = Integer.MAX_VALUE;
        for(int i =0; i<n; i++){
            if(mini >  nums[i]){
                mini = nums[i];
            }
        }
        return mini;
        // int low = 0;
        // int high = n-1;
        // int ans = -1;
        // while(low <= high){
        //     int mid = (low + high)/2;
        //     if(nums[mid] < nums[mid-1] && nums[mid+1]){
        //         ans = mid;
        //     }
        //     else{

        //     }
        // }
    }
}