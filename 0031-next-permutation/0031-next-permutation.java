class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int ind = -1;
        for(int i = n-2; i>= 0; i--){
            if(nums[i] < nums[i+1]){
                ind = i;
                break;
                
            }
        }
        if(ind == -1){
            reverse(nums);
            
        }
        if(ind != -1){    
        for(int i =n-1; i>=ind; i--){
            if(nums[ind] < nums[i]){
                swap(nums,ind,i);
                break;
            }
            
        }
        Arrays.sort(nums, ind+1,nums.length);
        }
    }
    void reverse(int nums[]){
        int n = nums.length;
        int left =0;
        int right = n-1;
        while(left <= right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
        // void sort(int[] nums, int start){
        //     int n = nums.length;
        // for(int i =start;i<n-1;i++){
        //     boolean swap =false;
        //     for(int j =start; j<n - (i - start) - 1; j++){
        //         if(nums[j] > nums[j+1]){
        //             swap(nums, j, j+1);
        //             swap = true;
        //         }
        //     }
        //     if(!swap){
        //         break;
        //     }
        // }
        // }
        
        void swap(int nums[] , int i , int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        
    }
}