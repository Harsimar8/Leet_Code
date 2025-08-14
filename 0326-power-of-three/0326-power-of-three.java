class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0){
            return false;
        }
        int ss = n;
        int d = 0;
        boolean flag = true;
        int g =n;
        int dd =n;
        while(g>0){
            if(dd == 1){
                return true;
            }
            if(dd % 3 == 0){
                dd/=3;
            }
            else if(dd % 3 != 0){
                break;
            }
            

        }
        if(n!=0){
            return false;
        }
        return true;
    }
}