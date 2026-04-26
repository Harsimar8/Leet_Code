class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return merge(nums, 0,n-1);

    }
    public int merge(int[] nums, int low,int high){
        if(low >= high){
            return 0;
        }
        int mid = (low + high)/2;
        int left = merge(nums, low, mid);
        int right = merge(nums, mid+1, high);
        int finalM = mergeSort(nums, low, mid, high);
        return left + right + finalM;
    }
    public int mergeSort(int[] nums, int low, int mid, int high){
        int j = mid + 1;
        int mm = j;
        int[] temp = new int[high - low + 1];
        int left = low;
        int last = 0;
        int k =0;
        int right = mid;
        for(int i=low; i<=mid; i++){
            while(j <= high && (long)nums[i] > (long)2*nums[j]){
                j++;
            }
            last += (j- (mid+1));
        }
        
        while(left <= mid && mm <= high){
            if(nums[left] < nums[mm]){
                temp[k] = nums[left];
                left++;
                k++;
            }
            else{
                temp[k] = nums[mm];
                mm++;
                k++;
            }
        }
        while(left <= mid){
                temp[k] = nums[left];
                left++;
                k++;
            
        }
        while(mm <= high){
            temp[k] = nums[mm];
            mm++;
            k++;
        }
        for(int l =0; l<temp.length; l++){
            nums[low + l] = temp[l];
        }
        return last;
    }
}