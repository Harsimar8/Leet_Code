class Solution {
    public boolean sumGame(String num) {
        int leftQ = 0;
        int rightQ =0;
        int leftS = 0;
        int rightS =0;
        int n = num.length();
        for(int i =0; i<n/2; i++){
            if(num.charAt(i) == '?'){
                leftQ++;
            }
            else{
                leftS += num.charAt(i) - '0';
            }
        }

        for(int i =n/2; i<n; i++){
            if(num.charAt(i) == '?'){
                rightQ++;
            }
            else{
                rightS += num.charAt(i) - '0';
            }
        }
        return ((leftS - rightS) * 2) !=  ((rightQ - leftQ) * 9);

    }
}