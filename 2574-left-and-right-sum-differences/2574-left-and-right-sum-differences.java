class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
       int[] ans = new int[n];
       int[] pre = new int[n];
       int[] suf = new int[n];
       int sum1 =0;
       int sum2  =0;
       for(int i =0; i<n-1; i++){
              sum1 += nums[i];
              pre[i+1] = sum1;
       }
       for(int j =n-1; j>0; j--){
        sum2 += nums[j];
        suf[j-1] = sum2;
       }
       for(int k =0; k<n; k++){
        ans[k] = Math.abs(pre[k] - suf[k]);
       }
       return ans;
    }
}