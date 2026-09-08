class Solution {
    public int countCommas(int n) {
        int cnt = 0;
        int ele = n;
        while(ele!= 0){
            int last = ele % 10;
            cnt++;
            ele/=10;
        }
        if(cnt < 4){
            return 0;
        }
        int ans = n - 1000;
        return ans +1;
    }
}