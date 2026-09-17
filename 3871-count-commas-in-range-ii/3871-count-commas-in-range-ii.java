class Solution {
    public long countCommas(long n) {
        if(n < 1000){
            return 0;
        }
        long rangeS = 1000;
        long rangeE = rangeS * 1000 -1;
        long comma = 1;
        long total = 0;
        while(rangeS <= n){
            long num = Math.min(n, rangeE) - rangeS + 1;
             total += (long) comma * num;

             if(rangeE > n){
                break;
             }
             rangeS = rangeS * 1000;
             rangeE = rangeS * 1000 - 1;
             comma++;
        }
        return total;
    }
}