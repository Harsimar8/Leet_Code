class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        for(int i =0; i<n; i++){
            if(arr[i] != 0){
                arr[i] = arr[i];
            }
        }
        int findZ =0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0 ){
                findZ =i;
                break;
            }
        }
        if(arr[findZ] == 0){
        for(int i = findZ; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(arr[j] != 0){
                    swap(arr, i, j);
                    break;
                }
            }
        }
        }
    }
    public void swap(int arr[] , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        
    }
}