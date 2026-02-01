class Pair{
    int c;
    int w;
    Pair(int c, int w){
        this.c = c;
        this.w = w;
    }
}
class Solution {
    public int minCost(int n, int[][] edges) {
        ArrayList<ArrayList<int[]>> ans = new ArrayList<>();
        for(int i =0; i<n; i++){
            ans.add(new ArrayList<>());
        }
        for(int[] e: edges){
            int u = e[0];
            int v = e[1];
            int w = e[2];
            ans.get(u).add(new int[]{v,w});
            ans.get(v).add(new int[]{u,2*w});
        }
        int mini = Integer.MAX_VALUE;
        PriorityQueue<Pair>q = new PriorityQueue<>((a,b) -> (a.w - b.w));
        
        q.offer(new Pair(0,0));
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        while(!q.isEmpty()){
            Pair arr = q.poll();
            int two = arr.c;
            int three = arr.w;
             if(three > dist[two]){
                continue;
             }
            
            for(int[] ll : ans.get(two)){
                int cc = ll[0];
                int dd = ll[1];
                if(dist[cc] > dd + three){
                 dist[cc] = dd + three;   
                q.offer(new Pair(cc,dd+three)); 
                }
            }
             
        }
        return dist[n-1] == Integer.MAX_VALUE ? -1 : dist[n-1];
    }
}