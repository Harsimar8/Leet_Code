class Solution {
    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        int i =0;
        int[] result = new int[n];
        int[][] arr = new int[n][2];
        for(int j =0; j<n; j++){
            arr[j][0] = nums[j];
            arr[j][1] = j;
        }
        Arrays.sort(arr, (a,b) -> (a[0]-b[0]));

        while(i < n){
            List<Integer> ind = new ArrayList<>();
            List<Integer> val = new ArrayList<>();


            ind.add(arr[i][1]);
            val.add(arr[i][0]);
            int j =i +1;
            while(j < n && arr[j][0] - arr[j-1][0] <= limit){
                ind.add(arr[j][1]);
                val.add(arr[j][0]);
                j++;
            }
            Collections.sort(ind);
            for(int k =0; k<ind.size(); k++){
                result[ind.get(k)] = val.get(k);
            }
            i = j;
        }
        return result;
    }
}