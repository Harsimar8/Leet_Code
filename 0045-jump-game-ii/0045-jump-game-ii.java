class Solution {
    public int jump(int[] nums) {
        int l =0;
        int r = 0;
        int jumps = 0;
        while(r < nums.length){
            int farth = 0;
        if(r >= nums.length -1){
                break;
        }
        for(int i = l; i<=r; i++){
            farth = Math.max(farth, i + nums[i]);
        }
        l = r + 1;
        r = farth;
        jumps++;
        }
        return jumps;
    }
}