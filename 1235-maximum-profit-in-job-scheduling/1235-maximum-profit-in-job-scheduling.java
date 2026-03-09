class Solution {
    public int jobScheduling(int[] start, int[] end, int[] profit) {
        int n = start.length;
        int[][] arr = new int[n][3];
        for(int i =0; i<n; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
            arr[i][2] = profit[i];
        }
        Arrays.sort(arr, (a,b) -> (a[1]-b[1]));
        int[] dp = new int[n];
        dp[0] = arr[0][2];
        for(int k =1; k<n; k++){
            int include = arr[k][2];
            int last = binary(arr,k);

            if(last != -1)
            include += dp[last];

            dp[k] = Math.max(dp[k-1], include);
        }
        return dp[n-1];
    }
    public int binary(int[][] arr, int index){
        int l =0;
        int r = index -1;
        while(l <= r){
            int mid = (l+r)/2;
            if(arr[mid][1] <= arr[index][0]){
                if(mid+1 <=r && arr[mid+1][1] <= arr[index][0]){
                    l = mid+1;
                }
                else{
                    return mid;
                }
            }
            else{
                r = mid -1;
            }
        }
        return -1;
    }
}