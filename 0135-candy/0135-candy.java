class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        for(int i =1; i<n; i++){
            if(arr[i] > arr[i-1]){
                ans[i] = ans[i-1] +1;
            }
        }
        
        for(int i = n-2; i>=0; i--){
            if(arr[i] > arr[i+1]){
                int val = ans[i+1] +1;
                if(val > ans[i]){
                    ans[i] = val;
                }
                
            }
        }
        int total =0;
        for(int k = 0; k<ans.length; k++){
            total += ans[k];
        }
        return total;

    }
}