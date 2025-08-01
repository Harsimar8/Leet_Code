class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int a = grid.length;
        int b = grid[0].length;
        for(int i =0; i<a; i++){
            Arrays.sort(grid[i]);
        }
        
        int total =0;
        for(int j = b-1;j>=0; j--){
            int max = Integer.MIN_VALUE;
            for(int i =0; i<a; i++){
                max = Math.max(max , grid[i][j]);
            }
            total += max;
        }
        return total;
    }
}