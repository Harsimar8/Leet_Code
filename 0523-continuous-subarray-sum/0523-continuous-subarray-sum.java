class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int n = nums.length;
        int right =0;
        int pre =0;
        int cnt =0;
        int left =0;
        mpp.put(0,-1);
        while(right <n){
            pre += nums[right];
            int val = (pre % k);

            if(k != 0){
                pre%=k;
            }
            if(mpp.containsKey(pre)){
                int ss = mpp.get(pre);
                if(right - ss >= 2){
                return true;
                }
            }else{
                mpp.put(pre,right);
            }

            
            right++;
        }
        return false;
    }
}