class Solution {
    public int[][] merge(int[][] e) {
        int m = e.length;
        
        Arrays.sort(e, (a,b) -> (a[0] != b[0]) ? Integer.compare(a[0],b[0]) : Integer.compare(a[1],b[1]) );
        int start = e[0][0];
        int end = e[0][1];
        List<int[]> ans = new ArrayList<>();
        for(int i =1; i<m; i++){
            int s = e[i][0];
            int e2 = e[i][1];
            if(s <= end){
                end = Math.max(e2,end);
            }
            else{
                ans.add(new int[]{start,end});
                start =s;
                end = e2;
            }
        }
        ans.add(new int[]{start, end});
        int[][] mat = new int[ans.size()][];
        for(int j =0; j<ans.size(); j++){
            mat[j] = ans.get(j);
        }
        return mat;
    }
}