class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] arr = new int[n];
        Arrays.fill(arr,1);
        int maxi = Integer.MIN_VALUE;
        for(int i = 1; i<n; i++){
            if(ratings[i-1] < ratings[i]){
                int val = arr[i-1];
                arr[i] = val +1;
            }
        }
        for(int i= n-2; i>=0; i--){
            if(ratings[i] > ratings[i+1]){
                int val = arr[i+1] +1;
                maxi = Math.max(arr[i], val);
                arr[i] = maxi;
            }
        }
        int total = 0;
        for(int i =0; i<arr.length; i++){
            total += arr[i];
        }
        return total;
    }
}