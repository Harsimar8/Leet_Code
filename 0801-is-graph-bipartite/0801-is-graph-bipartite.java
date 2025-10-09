class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        for(int i =0; i<n; i++){
            if(color[i] == 0){
            if(!dfs(graph, color, i,1)){
                return false;
            }
            }
        }
        return true;
    }
    public boolean dfs(int[][] graph, int[] color, int node, int c){
        color[node] = c;
        for(int ne : graph[node]){
            if(color[ne] == 0){
               if(!dfs(graph, color, ne, -c)){
                return false;
               }
            }
            else if(color[ne] == c){
                return false;
            }
        }
        return true;
    }
}