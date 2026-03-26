class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> ans = new ArrayList<>();
        int a = newInterval[0];
        int b = newInterval[1];

         int p =0;
         int s =0;
        for(int[] im : intervals){
            p = im[0];
            s = im[1];

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
                b = Math.max(s,b);
            }
        }
        ans.add(new int[]{a,b});
        int[][] res = new int[ans.size()][2];
        for(int j =0; j<ans.size(); j++){
            res[j] = ans.get(j);
        }
        return res;
    }
}