class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for(int i =0; i<nums.length;i++){
            if(nums[i] > end){
                end = nums[i];
            }
        }
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(smallestDivisorPossible(nums, mid, threshold)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;

            }
        }
        return ans;
    }
    public static boolean smallestDivisorPossible(int arr[], int maxT, int t){
        int total = 0;
        for(int i =0; i<arr.length; i++){
            total += arr[i]/maxT;
            if(arr[i]%maxT!=0){
                total += 1;
            }
            if(total > t){
                return false;
            }
        }
        return true;
    } 
}