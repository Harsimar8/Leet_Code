class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total =0;
        int n = weights.length;
        int maxi =0;
        for(int i =0; i<n; i++){
            total += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }
        if(days == 1){
            return total;
        }
        int low = maxi;
        int high = total;
        int ans = 0;
        while(low <= high){
            int mid = (low + high)/2;
            if(helper(weights, days, mid)){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public boolean helper(int[] weights, int days, int k){
        int d = 1;
        int n = weights.length;
        int sum = 0;
        for(int i =0; i<n; i++){
            if(sum + weights[i] > k){
                d++;
                sum = weights[i];
            }
            else{
                sum += weights[i];
            }
        }
        
        return (d <= days);
    }
}