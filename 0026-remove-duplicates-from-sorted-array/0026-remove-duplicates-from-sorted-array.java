class Solution {
    public int removeDuplicates(int[] nums) {
       int k =0;
       int count =0;
       int n = nums.length;
       for(int i =0; i<n; i++){
        if( i==0 || nums[i] != nums[i-1]){
            nums[k++] = nums[i];
        }
       }
       
       return k;
    }
}