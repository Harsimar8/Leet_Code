class Solution {
    public int maximumXorProduct(long a, long b, int n) {
        long mod = 1000000007L;
        
        long xXora = 0L;
        long xXorb = 0L;

// 49th bit to nth bit
        for(int i = 49; i>=n; i--){

            boolean a_ith_bit = ((a >> i) & 1L) > 0;  // finding the ith bit of a
            boolean b_ith_bit = ((b >> i) & 1L) > 0; // finding the ith bit of b

            if(a_ith_bit == true){    // ath_bit == 1
                xXora = (xXora ^ (1L << i));
            }
            if(b_ith_bit == true){  // ath_bit == 1
                xXorb = (xXorb ^ (1L << i));
            }

        }

        // (n-1)th bit to 0th bit
        for(int i = n-1; i>=0; i--){
            boolean a_ith_bit = ((a >> i) & 1L) == 1L; // finding the ith bit of a
            boolean b_ith_bit = ((b >> i) & 1L) == 1L; // finding the ith bit of b

            if(a_ith_bit == b_ith_bit){
                xXora = (xXora ^ (1L << i));
                xXorb = (xXorb ^ (1L << i));
                continue;
            }
            if(xXora > xXorb){
                xXorb = (xXorb ^ (1l << i));
            }
            else{
                xXora = (xXora ^ (1L << i));
            }
        }

         xXora  = (xXora % mod);
         xXorb  = (xXorb % mod);

         return (int)((xXora * xXorb) % mod);

    }

}