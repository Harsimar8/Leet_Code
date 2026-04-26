class Solution {
    public int[][] merge(int[][] intervals) {
        int m = intervals.length;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int a = intervals[0][0];
        int b = intervals[0][1];
        List<int[]> res = new ArrayList<>();
        for(int i =1; i<m; i++){
            int one = intervals[i][0];
            int two = intervals[i][1];

            if(one <= b){
                a = Math.min(a, one);
                b = Math.max(b, two);
            } 
            else{
                
                res.add(new int[]{a,b});
                a = one;
                b  = two;
            }
        }
        res.add(new int[]{a,b});
        int[][] val = new int[res.size()][2];
        for(int i =0; i<res.size(); i++){
            val[i] = res.get(i);
        }
        return val;
    }
}