class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        long mod = 1000000007L;
        long xa = 0L;
        long xb = 0L;
        for(int i = 49; i>=n; i--){
            boolean ath = ((a >> i) & 1L) > 0;
            boolean bth = ((b >> i) & 1L) > 0;

            if(ath == true){
                xa = (xa ^ (1L << i));
            }
            if(bth == true){
                xb = (xb ^ (1L << i));
            }
        }

        for(int i = n-1; i>=0; i--){
            boolean ath = ((a >> i) & 1L) > 0;
            boolean bth = ((b >> i) & 1L) > 0;

            if(ath == bth){
                xa = (xa ^ (1L << i));
                xb = (xb ^ (1L << i));
                continue;
            }
            else if(xa > xb){
                 xb = (xb ^ (1L << i));
            }
            else{
                xa = (xa ^ (1L << i));
            }
        }

        xa  =(xa %mod);
        xb = (xb % mod);

        return (int)((xa * xb)%mod);
    }
}