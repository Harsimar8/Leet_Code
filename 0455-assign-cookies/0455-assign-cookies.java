class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int l =0;
        int r =0;
        int high1 =g.length -1;
        int high2 = s.length-1;
        int cnt =0;
        while(l <=high1 && r <=high2){
            if(s[r] >= g[l]){
                cnt++;
                l++;
                r++;
                
            }
            else{
                r++;
            }
        }
        return cnt;
    }
}