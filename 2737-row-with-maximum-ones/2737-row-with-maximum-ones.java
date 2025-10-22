class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxcnt = 0;
        int rowI = 0;

        for (int i = 0; i < mat.length; i++) {
            int cnt = 0;
            for (int num : mat[i]) {
                if (num == 1) cnt++;
            }

            if (cnt > maxcnt) {
                maxcnt = cnt;
                rowI = i;
            }
        }

        return new int[]{rowI, maxcnt};
    }
}
