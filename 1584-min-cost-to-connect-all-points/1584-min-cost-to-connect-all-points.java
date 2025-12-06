class Pair{
    int id;
    int cost;
    Pair(int id, int cost){
        this.id = id;
        this.cost = cost;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> (a.cost-b.cost));
        int total = 0;
        int count =0; 
        boolean[] vis = new boolean[n];
        pq.offer(new Pair(0,0));
        while(count < n){
            Pair cur = pq.poll();
            int one = cur.id;
            int two = cur.cost;

            if(vis[one]){
                continue;
            }
            vis[one] = true;
            total += two;
            count++;

            for(int i =0; i<n; i++){
                if(!vis[i]){
                    int dist = Math.abs(points[one][0] - points[i][0]) + 
                    Math.abs(points[one][1] - points[i][1]);
                    pq.offer(new Pair(i,dist));
                }
            }
        }
        return total;
    }
}