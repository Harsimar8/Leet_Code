class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int a = newInterval[0];
        int b = newInterval[1];
        ArrayList<int[]> ans = new ArrayList<>();
        for(int[] cur : intervals){
            int p = cur[0];
            int s = cur[1];
            if(s < a){
                ans.add(new int[]{p,s});
            }
            else if(p > b){
                ans.add(new int[]{a,b});
                a = p;
                b = s;
            }
            else{
                a = Math.min(a,p);
                b = Math.max(b,s);
            }
        }
        ans.add(new int[]{a,b});
        int[][] res = new int[ans.size()][];
        for(int i =0; i<ans.size(); i++){
            res[i]  =ans.get(i);
        }
        return res;
    }
}