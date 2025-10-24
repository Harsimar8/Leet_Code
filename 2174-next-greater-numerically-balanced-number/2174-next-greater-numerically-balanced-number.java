class Solution {
    
    private boolean isBalance(int x) {
        int[] cnt = new int[10];
        int temp = x;
        
        while (temp > 0) {
            int d = temp % 10;
            if (d == 0) return false; 
            cnt[d]++;
            temp /= 10;
        }

        for (int d = 1; d <= 9; d++) {
            if (cnt[d] > 0 && cnt[d] != d) {
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for (int x = n + 1; ; x++) {
            if (isBalance(x)) {
                return x;
            }
            
            if (x > 1_000_000_000) { 
                
                break;
            }
        }
        return -1; 
    }
}