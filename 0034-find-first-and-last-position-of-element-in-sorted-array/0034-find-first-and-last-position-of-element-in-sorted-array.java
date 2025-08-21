class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int pos1 = 0;
        int pos2 =1;
        int first = binarySearch(nums, target, 0);
        int last = binarySearch(nums, target, 1);
        res[0] = first;
        res[1] = last;
        return res;
    }
    public int binarySearch(int[]nums, int target, int pos){
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int ans = -1;
        
        for(int i =0; i<n;i++){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                if(pos == 0){
                    ans = mid;
                    high = mid -1;
                }
                else{
                    ans = mid;
                    low = mid +1;
                }
               
            }
            else if(nums[mid] < target){
                if(pos == 0){
                    low = mid +1;

                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(pos == 0){
                    high = mid -1;
                }
                else{
                    high = mid -1;
                }
            }
        }
        return ans;
    }
}