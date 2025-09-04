class Solution {
    public int minDays(int[] bloom, int m, int k) {
        int n = bloom.length;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        long res = (long)m *k;
        if(res > n){
            return -1;
        }
        int ans =0;
        for(int i =0; i<n; i++){
            mini = Math.min(mini, bloom[i]);
            maxi = Math.max(maxi, bloom[i]);
        }
        int low =mini;
        int high = maxi;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(bloom,mid,m,k)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public boolean isPossible(int[] bloom, int day , int m, int k){
        int n = bloom.length;
        int cnt =0;
        int noof = 0;
        for(int i =0; i<n; i++){
            if(bloom[i] <= day){
                cnt++;
            }
            else{
                noof += cnt/k;
                cnt =0;
            }
        }
        noof += cnt/k;
        return noof >= m;
    }
}