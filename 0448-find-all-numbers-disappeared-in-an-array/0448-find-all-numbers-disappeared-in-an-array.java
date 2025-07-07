class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        int n = nums.length;
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i =0; i<=n-1; i++){
            int key = nums[i];
                if(key != i +1){
                    res.add(i+1);
                }
            }
        
        return res;
    }
    public void cycleSort(int[] arr){
        int n = arr.length;
        int i =0;
        while(i < n){
            int val = arr[i];
            int correctPos = arr[i] -1;
            if(arr[correctPos] != val){
                swap(arr,correctPos , i);
            }
            else{
            i++;
            }
        }
    }
    public void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}