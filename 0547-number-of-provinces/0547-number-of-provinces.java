class Solution {
    public int findCircleNum(int[][] isC) {
        boolean[] visited = new boolean[isC.length];
        int cnt =0;
        for(int i =0; i<isC.length; i++){
            if(!visited[i]){
                dfs(isC, visited, i);
                cnt++;
            }
        }
        return cnt;
    }
    public void dfs(int[][] isCC, boolean[] visited, int aa){
        for(int i =0; i<isCC.length; i++){
            if(isCC[aa][i] == 1 && !visited[i]){
                visited[i] = true;
                dfs(isCC, visited, i);
            }
        }
    }
}