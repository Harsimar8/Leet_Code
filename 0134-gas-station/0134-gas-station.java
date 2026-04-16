class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalG =0;
        int totalA = 0;
        for(int i =0; i<n; i++){
            totalG += gas[i];
        }
        for(int j =0; j<n; j++){
            totalA += cost[j];
        }
        if(totalG < totalA){
            return -1;
        }
        int start =0;
        int cur =0;
        for(int i =0; i<n; i++){
            cur += gas[i] - cost[i];
            if(cur < 0){
                start = i +1;
                cur = 0;
            }
        }
        return start;

    }
}