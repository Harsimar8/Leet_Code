class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int numB = numBottles;
        int numE = numExchange;
        int cnt =0;
        int numF = numB;
        int numEmpty = 0;
        while(numB >= numE){
            cnt += numF;
            numEmpty += numF;
            numF = 0;
            int ans =0;
            if(numEmpty >= numE){
                ans =  numEmpty/numE;
                numF = ans;
                numEmpty = numEmpty - (numE * numF);
            }
            numB = numF + numEmpty;
        }
        return cnt + numF;
    }
}