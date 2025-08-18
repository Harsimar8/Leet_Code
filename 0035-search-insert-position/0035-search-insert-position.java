class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int index =-1;
        boolean flag = false;
        while(low <= high){
            
            int mid = low + (high - low)/2;
            if(nums[mid] == target){
                flag = true;
                return mid;
            }
            else if(nums[mid] < target){
                low = mid +1;
                index = low;
            }
            else{
                
                high = mid -1;
                index = high+1;
            }
        }
        if(!flag){
            return index;
        }
        
            return -1;

    }
}