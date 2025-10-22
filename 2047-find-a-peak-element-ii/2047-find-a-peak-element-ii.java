class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        int left = 0, right = n - 1;

        while (left <= right) {
            int midi = left + (right - left) / 2;

            int maxi = 0;
            for (int i = 0; i < m; i++) {
                if (mat[i][midi] > mat[maxi][midi]) {
                    maxi = i;
                }
            }

            int leftV = midi > 0 ? mat[maxi][midi - 1] : -1;
            int rightV = midi < n - 1 ? mat[maxi][midi + 1] : -1;

            if (mat[maxi][midi] > leftV && mat[maxi][midi] > rightV) {
                return new int[]{maxi, midi};
            } else if (leftV > mat[maxi][midi]) {
                right = midi - 1;
            } else {
                left = midi + 1;
            }
        }

        return new int[]{-1, -1}; 
    }
}
