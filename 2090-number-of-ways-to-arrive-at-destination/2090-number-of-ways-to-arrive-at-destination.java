class Solution {
     class Pair{
        long lp;
        int lo;
        Pair(long lp, int lo){
            this.lp = lp;
            this.lo = lo;
        }
     }
    public int countPaths(int n, int[][] roads) {
        List<List<int[]>> as = new ArrayList<>();
        for(int i =0; i<n;i++){
            as.add(new ArrayList<>());
        }
        for(int[] r : roads){
            int u = r[0];
            int v = r[1];
            int w = r[2];
            as.get(u).add(new int[]{v,w});
            as.get(v).add(new int[]{u,w});

        }
        PriorityQueue<Pair> q = new PriorityQueue<>((a,b) -> Long.compare(a.lp,b.lp));
        q.offer(new Pair(0,0));
        long[] dist = new long[n];
        int[] ways = new int[n];
        Arrays.fill(dist,Long.MAX_VALUE);
        dist[0] = 0;
        ways[0] =1;
        int mid = (int)1e9 + 7;
        while(!q.isEmpty()){
            Pair c = q.poll();
            long dis = c.lp;
            int node = c.lo;
            if(dis > dist[node]){
                continue;
            }
            
            for(int[] f : as.get(node)){
                int adjN = f[0];
                int ed = f[1];
                long aa = ed + dis;
                if(dist[adjN] > aa){
                    dist[adjN] = aa;
                    ways[adjN] = ways[node];
                    q.offer(new Pair(aa,adjN));
                }
                else if(dist[adjN] == ed + dis){
                    ways[adjN] = (int)(ways[node] + (long)ways[adjN]) % mid;
                }
            }
        }
        return ways[n-1]%mid;

    }
}