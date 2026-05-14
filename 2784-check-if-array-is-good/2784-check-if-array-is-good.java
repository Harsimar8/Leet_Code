class Solution {
    public boolean isGood(int[] nums) {
        int mx = 0;

        for (int x : nums) {
            mx = Math.max(mx, x);
        }

        if (nums.length != mx + 1)
            return false;
        int n = nums.length;
         int[] freq = new int[mx+1];

         for(int i = 0; i<n; i++){
            if(nums[i] <1 || nums[i] > mx){
                return false;
            }
            freq[nums[i]]++;
         }   
         for(int k = 1; k<mx; k++){
            if(freq[k] != 1){
                return false;
            }
         }
         return freq[mx] == 2;
        
    }
}