class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int right =0;
        int cnt =0;
        int left =0;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int sum =0;
        while(right < n){
            sum += nums[right];

            
            if(mpp.containsKey(sum -k)){
                cnt += mpp.get(sum -k);
               
            }
            mpp.put(sum, mpp.getOrDefault(sum,0)+1);
            right++;
            
        }
        return cnt;
    }
}