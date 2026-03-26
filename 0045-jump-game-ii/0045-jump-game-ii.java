class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxi =0;
        int cnt =0;
        int farth =0;
        int end =0;
        for(int i =0; i<n-1; i++){
            maxi = Math.max(maxi, nums[i] + i);
        
            if(i == end){
                cnt++;
                end = maxi;
            }
        }
        return cnt;
    }
}