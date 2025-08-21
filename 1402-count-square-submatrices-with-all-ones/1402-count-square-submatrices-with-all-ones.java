class Solution {
    public int countSquares(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int count = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 1) {
                    int maxSize = Math.min(rows - i, cols - j);
                    for (int size = 1; size <= maxSize; size++) {
                        boolean isSquare = true;
                        for (int x = i; x < i + size; x++) {
                            for (int y = j; y < j + size; y++) {
                                if (matrix[x][y] != 1) {
                                    isSquare = false;
                                    break;
                                }
                            }
                            if (!isSquare) break;
                        }
                        if (isSquare) count++;
                        else break; // No need to check larger squares
                    }
                }
            }
        }

        return count;
    }
}
