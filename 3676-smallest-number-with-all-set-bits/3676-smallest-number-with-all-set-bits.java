class Solution {
    public int smallestNumber(int n) {
      
        if (n <= 0) {
            return 1;
        }

       
        int k = 32 - Integer.numberOfLeadingZeros(n);

        if (k == 31) {
            return Integer.MAX_VALUE; 
        }

        return (1 << k) - 1;
 
    }
}