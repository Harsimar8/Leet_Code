class Solution {
    public int mySqrt(int x) {
        int low = 0;
        int high = x-1;
        if(x == 0 || x == 1){
            return x;
        }
        int ans =0;
        int mini = Integer.MIN_VALUE;
        while(low <= high){
            int mid = low + (high - low)/2;
            long ll = mid;
            if(ll * ll ==x){
                return mid;
            }
            else if(ll * ll < x){
                ans = mid;
                mini = Math.max(ans,mini);
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return mini;
    }
}