class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length-1;
    
        int index =0;
        while(index <n){
            if(arr[index] < arr[index +1]){
                index++;
            }
            else{
                break;
            }
        }
        if(index == 0 || index == n){
            return false;
        }
        while(index < n){
            if(arr[index] > arr[index + 1]){
                index++;
            }
            else{
                break;
            }
        }
        return (index == n);
    }
}