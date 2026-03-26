class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));
        ArrayList<int[]> arr = new ArrayList<>();

        int a = intervals[0][0];
        int b = intervals[0][1];

        for(int i =1 ;i<n; i++){
            int one = intervals[i][0];
            int two = intervals[i][1];

            if(one <= b){
                b = Math.max(b, two);
            }
            else{
                arr.add(new int[]{a,b});
                a = one;
                b = two;
            }
        }

        arr.add(new int[]{a,b});
        int[][] result = new int[arr.size()][2];
        for(int k =0; k<arr.size(); k++){
            result[k] = arr.get(k);
        }
        return result;

    }
}