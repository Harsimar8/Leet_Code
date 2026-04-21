class Solution {
    public int[][] merge(int[][] intervals) {
        int m = intervals.length;
        int n = intervals[0].length;
        
        ArrayList<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals,(c,d) -> (c[0]-d[0]));
        int a = intervals[0][0];
        int b = intervals[0][1];
        for(int i =1; i<m; i++){
            int one = intervals[i][0];
            int two = intervals[i][1];

            if(one <= b){
                a = Math.min(a, one);
                b = Math.max(b, two);
            }
            else{
                ans.add(new int[]{a,b});
                a = one;
                b = two;
            }
        }
        ans.add(new int[]{a,b});
        int[][] res = new int[ans.size()][2];
        for(int i =0; i<ans.size(); i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}