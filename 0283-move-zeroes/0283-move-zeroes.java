class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int j =0;
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                swap(arr, i ,j);
                j++;
            }
        }
    }
    public void swap(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}