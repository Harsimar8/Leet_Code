class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int n = nums.length;
        int end = n -1;
        int ans =-1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                return mid;
            }
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target < nums[mid]){
                end = mid -1;}
                else{
                start = mid +1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[end]){
                    start  = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
        }
        return ans;
    }
}