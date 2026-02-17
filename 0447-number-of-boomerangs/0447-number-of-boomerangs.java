class Solution {
    public int numberOfBoomerangs(int[][] points) {
        int total =0;
        int n = points.length;
        for(int i =0; i<n; i++){
            HashMap<Integer,Integer> mpp = new HashMap<>();
            for(int j =0; j<n; j++){
                if(i ==j){
                    continue;
                }
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                int val = dx*dx + dy*dy;
                mpp.put(val,mpp.getOrDefault(val,0)+1);
            }

            for(int c : mpp.values()){
                total += c * (c-1);
            }
        }
        return total;
    }
}