class Solution {
    public int reversePairs(int[] nums) {
        int n = nums.length;
        return merge(nums, 0, n-1);
    }
    public int merge(int[] nums, int low, int high){
        if(low >= high){
            return 0;
        }
        int mid = low + (high - low)/2;
        int left = merge(nums, low, mid);
        int right = merge(nums,mid +1, high);
        int finalC = mergeSort(nums,low, mid , high);
        return left + right + finalC;
    }
    public int mergeSort(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid +1;
        int[] temp = new int[high- low +1];
        int j = mid +1;
        int last =0;
        for(int i =low; i<=mid; i++){
            while(j <= high && (long)nums[i] > (long)2 * nums[j]){
                j++;
            }
            last += j - (mid +1);
        }
        int k = 0;
        while(left<= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp[k] = nums[left];
                left++;
                k++;
            }
            else{
                temp[k] = nums[right];
                right++;
                k++;
            }
        }
        while(left <= mid){
            temp[k] = nums[left];
            left++;
            k++;
        }
        while(right <= high){
            temp[k] = nums[right];
            right++;
            k++;
        }
        for(int l = 0; l<temp.length; l++){
            nums[low + l] = temp[l];
        }
        return last;
    }
}