class Solution {
    public int search(int[] nums, int target) {
    //   int n = nums.length;
    //   int low = 0;
    //   int high = n-1;
    //   Arrays.sort(nums);
    //   int ans =0;
    //   while(low <= high){
    //     int mid = low + (high - low)/2;
    //     if(nums[mid] == target){
    //         ans = mid;
    //         break;
    //     }
    //     else if(target > nums[mid]){
    //         low = mid +1;
    //     }
    //     else{
    //         high = mid -1;
    //     }
    //   }
    //   return ans;
    int n = nums.length;
    int ans =0;
    boolean flag = false;
    for(int i =0; i<n; i++){
        
        if(target == nums[i]){
            ans = i;
            flag = true;
        }
        
    }
    if(flag){
    return ans;
    }
    else{
        return -1;
    }
    }
}