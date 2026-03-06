class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int right =0;
        int left =0;
        int preSum  =0;
        int n = nums.length;
        mpp.put(0,-1);
        while(right < n){
            preSum += nums[right];
            if(k!=0){
                preSum%=k;
            }
            if(mpp.containsKey(preSum)){
                int ss = mpp.get(preSum);
                if(right - ss >=2){
                    return true;
                }
            }
            else{
                mpp.put(preSum, right);
            }
            right++;


        }
        return false;
    }
}