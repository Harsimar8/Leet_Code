class Solution {
    public boolean hasSameDigits(String s) {
        StringBuilder ans = new StringBuilder(s);
        int len = ans.length();
        
        int num_operations = len - 2;
        
        for (int op = 0; op < num_operations; op++) {
            StringBuilder res = new StringBuilder();
            int curL = ans.length();
            
            for (int i = 0; i < curL - 1; i++) {
                
                int d1 = ans.charAt(i) - '0';
                int d2 = ans.charAt(i+1) - '0';
                int digit = (d1 + d2) % 10;
                res.append(digit);
            }
            ans = res;
        }
        
        return ans.charAt(0) == ans.charAt(1);
    }
}