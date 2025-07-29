class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i =0; i<n; i++){
            int elem = nums[i];
            int ans =-1;
            boolean flag = false;
            for(int j =i+1; j<n; j++){
                if(nums[j] > elem){
                    ans = nums[j];
                    flag =true;
                    break;
                }
            }
            if(!flag){
                for(int k =0;k<i; k++){
                    if(nums[k] > elem){
                        ans = nums[k];
                        break;
                    }               
                    
                }
            }
            res[i] = ans;
        }
        return res;
    }
}