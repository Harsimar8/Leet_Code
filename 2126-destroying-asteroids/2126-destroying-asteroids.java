class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int j = 0; j<n; j++){
            pq.add(asteroids[j]);
        }
       
        long sum = mass;
        while(!pq.isEmpty()){
            long val = pq.poll();
            if(sum < val){
                return false;
            }
            sum +=  val;
        }
        return true;
    }
}