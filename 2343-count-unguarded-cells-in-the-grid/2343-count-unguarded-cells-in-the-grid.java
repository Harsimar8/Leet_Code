import java.util.*;

class Solution {
    void dfs(int r, int c, String dir, int[][] vis, Map<String, Integer> mpp) {
        int n = vis.length;
        int m = vis[0].length;
        if (r < 0 || c < 0 || r >= n || c >= m) return;
        if (mpp.containsKey(r + "," + c)) return;
        vis[r][c] = 1;

        if (dir.equals("r")) dfs(r, c + 1, "r", vis, mpp);
        if (dir.equals("l")) dfs(r, c - 1, "l", vis, mpp);
        if (dir.equals("u")) dfs(r - 1, c, "u", vis, mpp);
        if (dir.equals("d")) dfs(r + 1, c, "d", vis, mpp);
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] vis = new int[m][n];
        Queue<int[]> q = new LinkedList<>();
        Map<String, Integer> mpp = new HashMap<>();

        for (int[] g : guards) {
            q.add(g);
            mpp.put(g[0] + "," + g[1], 1);
            vis[g[0]][g[1]] = 1;
        }

        for (int[] w : walls) {
            mpp.put(w[0] + "," + w[1], 1);
            vis[w[0]][w[1]] = 1;
        }

        for (int[] a : guards) {
            int r = a[0], c = a[1];
            dfs(r, c + 1, "r", vis, mpp);
            dfs(r, c - 1, "l", vis, mpp);
            dfs(r + 1, c, "d", vis, mpp);
            dfs(r - 1, c, "u", vis, mpp);
        }

        int cnt = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (vis[i][j] == 0) cnt++;
        return cnt;
    }
}