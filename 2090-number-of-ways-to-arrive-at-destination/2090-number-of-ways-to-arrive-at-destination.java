import java.util.*;

class Solution {
    public int countPaths(int n, int[][] roads) {
        final int MOD = 1_000_000_007;

        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] road : roads) {
            graph.get(road[0]).add(new int[]{road[1], road[2]});
            graph.get(road[1]).add(new int[]{road[0], road[2]});
        }

    
        long[] dist = new long[n];
        Arrays.fill(dist, Long.MAX_VALUE);
        dist[0] = 0;

        int[] ways = new int[n];
        ways[0] = 1;

        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0, 0}); // {time, node}

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long time = curr[0];
            int node = (int) curr[1];

            if (time > dist[node]) continue;

            for (int[] neighbor : graph.get(node)) {
                int next = neighbor[0];
                long newTime = time + neighbor[1];

                if (newTime < dist[next]) {
                    dist[next] = newTime;
                    ways[next] = ways[node];
                    pq.offer(new long[]{newTime, next});
                } else if (newTime == dist[next]) {
                    ways[next] = (ways[next] + ways[node]) % MOD;
                }
            }
        }

        return ways[n - 1];
    }
}
