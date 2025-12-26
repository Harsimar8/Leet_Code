class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        ArrayList<Integer> res = new ArrayList<>();
        for(int i =0; i<n-1; i++){
            int maxi = -1;
            for(int k = i+1; k<n; k++){
                if(arr[k] > maxi){
                    maxi = Math.max(maxi, arr[k]);
                }
            }
            res.add(maxi);
        }
        res.add(-1);
        for(int l = 0; l<res.size(); l++){
            ans[l] = res.get(l);
        }
        return ans;
    }
}