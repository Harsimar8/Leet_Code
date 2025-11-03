class Solution {
    class Pair{
        int a;
        int b;
        int c;
        Pair(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<int[]>> ans = new ArrayList<>();
        for(int i =0; i<n;i++){
            ans.add(new ArrayList<>());
        }
        for(int[] f : flights){
            ans.get(f[0]).add(new int[]{f[1],f[2]});
        }
        Queue<Pair> q = new ArrayDeque<>();
        q.offer(new Pair(0,src,0));
        int[] dist = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        while(!q.isEmpty()){
            Pair p = q.poll();
            int stops = p.a;
            int node = p.b;
            int cost = p.c;
            for(int[] neigh : ans.get(node)){
                int next = neigh[0];
                int nextCost = neigh[1];
                if(cost + nextCost < dist[next] && stops <= k){
                    dist[next] = cost + nextCost;
                    q.offer(new Pair(stops + 1, next, cost + nextCost));
                }
            }
        }
        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}