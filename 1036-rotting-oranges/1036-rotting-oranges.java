class Node{
    int row;
    int col;
    int time;
    Node(int row, int col, int time){
        this.row = row;
        this.col = col;
        this.time = time;
    }
}
class Solution {
    int[][] directions = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public boolean isValid(int i, int j, int rows,  int cols){
        return (i>=0 && j>=0 && i<rows && j<cols);
    }
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int fresh =0;
        Queue<Node> q = new ArrayDeque<>();
        for(int i =0; i<m;i++){
            for(int j =0; j<n; j++){
                if(grid[i][j] == 2){
                    q.offer(new Node(i,j,0));
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int minTime = 0;
        while(!q.isEmpty()){
            Node curr = q.poll();
            for(int[] dir: directions){
                int newRow = curr.row + dir[0];
                int newCol  = curr.col + dir[1];
                if(isValid(newRow,newCol,m,n) && grid[newRow][newCol] == 1){
                    q.offer(new Node(newRow,newCol, curr.time + 1));
                    grid[newRow][newCol] = 2;
                    fresh--;
                    minTime = curr.time + 1;
                }
            }
        }
        return fresh == 0 ? minTime : -1;
    }
}