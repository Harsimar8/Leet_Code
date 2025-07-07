class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cycleSort(nums);
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        for(int i =0; i<=n-1; i++){
            if(nums[i] != i+1){
                res.add(nums[i]);
            }
        }
        return res;
    }
    public void cycleSort(int[] arr){
        int n = arr.length;
        int index =0;
        while(index < n){
            
            int correctPos = arr[index] -1;
            if(arr[correctPos] != arr[index]){
                swap(arr,correctPos, index);
            }
            else{
                index++;
            }
        }
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}