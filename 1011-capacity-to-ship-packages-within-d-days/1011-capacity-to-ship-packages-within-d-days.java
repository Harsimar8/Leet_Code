class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int total =0;
        int n = weights.length;
        int maxi  = 0;
        for(int i = 0; i<n; i++){
            total += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }   
        int low = maxi;
        int high = total;
        int ans =0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(weights, days, mid)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int d, int sol){
        int j =0;
        int days =0;
        int n = arr.length;
        while(j < arr.length){
            if(j >= arr.length){
                break;
            }
            int sum  =0;
            
            while(sum <= sol && j < n){
                if(arr[j] + sum > sol){
                    break;
                }
                sum += arr[j];
                j++;
            }
            days++;
            
        }
        if(days <= d){
            return true;
        }
        else{
            return false;
        }
    }
}