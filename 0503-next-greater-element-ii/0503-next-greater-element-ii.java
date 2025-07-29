class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n = nums.length;
       int[] ans = new int[n];
       for(int i =0; i<n; i++){
        int elem = nums[i];
        boolean flag = false;
        int res= -1;
        for(int j = i+1; j<n; j++){
            if(nums[j] > elem){
                res = nums[j];
                flag = true;
                break;
            }
            
        }
        if(!flag){
                for(int k =0 ; k<= i-1; k++){
                    if(nums[k] > elem){
                    res = nums[k];
                    break;
                    }   
        }
        }
        ans[i] = res;
       }
       return ans; 
    }
}