class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        int[] minr = new int[n+1];
        int[] minc = new int[n+1];
        int[] maxr = new int[n+1];
        int[] maxc = new int[n+1];
        Arrays.fill(minr,Integer.MAX_VALUE);
        Arrays.fill(minc, Integer.MAX_VALUE);
        for(int[] b : buildings){
            int x = b[0];
            int y = b[1];
            minr[y] = Math.min(minr[y],x);
            minc[x] = Math.min(minc[x],y);
            maxr[y] = Math.max(maxr[y],x);
            maxc[x] = Math.max(maxc[x],y);
        }
        int cnt =0;
        for(int[] a : buildings){
            int x = a[0];
            int y = a[1];
            if(x > minr[y] && x < maxr[y] && y > minc[x] && y < maxc[x]){
                cnt++;
            }
        }
        return cnt;
    }
}