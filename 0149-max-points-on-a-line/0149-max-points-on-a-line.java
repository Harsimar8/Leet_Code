class Solution {
    public int maxPoints(int[][] points) {
        int result =0;
        int n = points.length;
        if(n<=2){
            return n;
        }
        for(int i =0; i<n; i++){
            HashMap<String, Integer> mpp = new HashMap<>();
            int same  =1;
            int maxi = 0;
            for(int j =i+1; j<n; j++){
                int dx = points[i][0] - points[j][0];
                int dy = points[i][1] - points[j][1];
                if(dx == 0 && dy == 0){
                    same++;
                    continue;
                }
                int gc =  gcd(dx,dy);
                dx /=gc;

                dy /=gc;

                String slope = dx + "/" + dy;
                mpp.put(slope, mpp.getOrDefault(slope,0)+1);

                maxi = Math.max(maxi, mpp.get(slope));
            }
            result = Math.max(result, maxi + same);
        }
        return result;
    }
    public int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
}