class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int maxi = Integer.MIN_VALUE;
        int cnt =0;
        int last =0;
        for(int i =0; i<n-1; i++){
            maxi = Math.max(maxi, i + nums[i]);
            if(i == last){
                last = maxi;
                cnt++;
            }
        }
        
        return cnt;
    }
}