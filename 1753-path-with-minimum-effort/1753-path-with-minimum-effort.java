import java.util.*;

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;

        int[][] effort = new int[m][n];
        for (int[] row : effort) Arrays.fill(row, Integer.MAX_VALUE);
        effort[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0}); // {effort, row, col}

        int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int currEffort = curr[0], x = curr[1], y = curr[2];

            if (x == m - 1 && y == n - 1) return currEffort;

            for (int[] d : dirs) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < m && ny < n) {
                    int nextEffort = Math.max(currEffort, Math.abs(heights[x][y] - heights[nx][ny]));
                    if (nextEffort < effort[nx][ny]) {
                        effort[nx][ny] = nextEffort;
                        pq.offer(new int[]{nextEffort, nx, ny});
                    }
                }
            }
        }

        return 0; 
    }
}
