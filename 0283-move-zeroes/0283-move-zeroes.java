class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr= new int[n];
        
        int j =0;
        for(int i =0; i<n; i++){
            if(nums[i] != 0){
                arr[j++] = nums[i];
            }
        }
        int l =0;
        for(int k=0; k<arr.length; k++){
            nums[k] = arr[l++];
           
        }
        

    }
}