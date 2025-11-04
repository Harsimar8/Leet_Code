class Solution {
    public int minCost(String colors, int[] neededTime) {
        char[] ch = colors.toCharArray();
        int n  = ch.length;
        int maxi = neededTime[0];
        int total =0;
        for(int i =1; i<n; i++){
            if(ch[i] == ch[i-1]){
            total += Math.min(maxi, neededTime[i]);
            maxi = Math.max(maxi, neededTime[i]);
            }
            else{
                maxi = neededTime[i];
            }
        }
        return total;
    }
}