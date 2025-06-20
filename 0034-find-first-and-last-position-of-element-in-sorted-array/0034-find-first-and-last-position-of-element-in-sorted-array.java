class Solution {
    public int[] searchRange(int[] nums, int target) {
         int res[] = new int[2];
         int first = binarySearch(nums, target, true);
         int last = binarySearch(nums, target, false);
         res[0] = first;
         res[1] = last;
         return res;
    }
    public static int binarySearch(int arr[] ,int target , boolean findFirst){
        int s =0;
        int e = arr.length -1;
        int ans =-1;
        while(s <= e){
            int mid = s + (e -s)/2;
            if(arr[mid] == target){
                ans = mid;
                if(findFirst){
                    e = mid -1;
                }
                else{
                    s = mid +1;
                }
            }
            else if(arr[mid] < target){
                s = mid +1;
            }
            else{
                e = mid -1;
            }
        }
        return ans;
    }
}