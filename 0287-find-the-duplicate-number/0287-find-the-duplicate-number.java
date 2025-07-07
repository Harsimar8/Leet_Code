class Solution {
    public int findDuplicate(int[] nums) {
        cycleSort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i =0; i<n; i++){
            if(nums[i] != i+1){
                ans = nums[i];
            }
        }
        return ans;
    }
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    swap(arr, j , j+1);
                }
            }
        }
    }
    public void cycleSort(int[] arr){
        int n = arr.length;
        int index =0;
        while(index < n){
               
                int correctPos = arr[index] -1;
                if(arr[correctPos] != arr[index]){
                    swap(arr,correctPos , index);
                }
                else{
                index++;
                }
        }
    }
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}