class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low =0;
        int mid =0;
        int high = n-1;
        for(int i =0; i<n;i++){
            if(nums[mid]== 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    public static void swap(int[] arr,int i , int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
}