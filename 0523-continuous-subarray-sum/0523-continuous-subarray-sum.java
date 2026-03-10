class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int right =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,-1);
       
        int preS =0;
        while(right < n){
            preS += nums[right];
            if(k!=0){
                preS%=k;
            }
            if(mpp.containsKey(preS)){
                int ss = mpp.get(preS);

                if(right - ss >=2){
                    return true;
                }
            }

            else{
                mpp.put(preS, right);
            }
            right++;
        }
        return false;
    }
}