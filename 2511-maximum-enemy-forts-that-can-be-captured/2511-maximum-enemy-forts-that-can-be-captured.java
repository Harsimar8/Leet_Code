class Solution {
    public int captureForts(int[] forts) {
     int maxiLen =0;
     int lastIn = -1;
     int n = forts.length;
     for(int i =0; i<n; i++){
        if(forts[i] != 0){
            if(lastIn != -1 && forts[i] != forts[lastIn]){
                maxiLen = Math.max((Math.abs(i-lastIn)-1), maxiLen);
            }
            lastIn = i;
        }
     }   
     return maxiLen;
    }
}