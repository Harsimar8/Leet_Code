class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int a = newInterval[0];
        int b = newInterval[1];

        for(int i = 0; i<intervals.length; i++){
            int one = intervals[i][0];
            int two = intervals[i][1];

            if(a > two){
                ans.add(new int[]{one, two});
            }
            else if(b < one){
                ans.add(new int[]{a,b});
                a = one;
                b = two;
            }
            else{
                a = Math.min(a, one);
                b = Math.max(b, two);
            }
        }
        ans.add(new int[]{a,b});
        int[][] res = new int[ans.size()][];
        for(int k =0; k<ans.size(); k++){
            res[k] = ans.get(k);
        }
        return res;
    }
}