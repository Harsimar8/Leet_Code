import java.util.*;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> result = new ArrayList<>();
        if (heights == null || heights.length == 0) return result;
        
        int rows = heights.length;
        int cols = heights[0].length;
        
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
    
        for (int c = 0; c < cols; c++) {
            dfs(heights, 0, c, Integer.MIN_VALUE, pacific);
            dfs(heights, rows - 1, c, Integer.MIN_VALUE, atlantic);
        }
        
        for (int r = 0; r < rows; r++) {
            dfs(heights, r, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, r, cols - 1, Integer.MIN_VALUE, atlantic);
        }
        
    
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (pacific[r][c] && atlantic[r][c]) {
                    result.add(Arrays.asList(r, c));
                }
            }
        }
        
        return result;
    }
    
    private void dfs(int[][] heights, int r, int c, int prevHeight, boolean[][] ocean) {
        int rows = heights.length;
        int cols = heights[0].length;
        
   
        if (r < 0 || c < 0 || r >= rows || c >= cols) return;
        if (ocean[r][c]) return;
        if (heights[r][c] < prevHeight) return;
        
        ocean[r][c] = true;
        
   
        dfs(heights, r + 1, c, heights[r][c], ocean);
        dfs(heights, r - 1, c, heights[r][c], ocean);
        dfs(heights, r, c + 1, heights[r][c], ocean);
        dfs(heights, r, c - 1, heights[r][c], ocean);
    }
}
