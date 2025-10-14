class Solution {
    public boolean canFinish(int num, int[][] pre) {
        Queue<Integer> q = new ArrayDeque<>();
        int[] inD = new int[num];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i =0; i<num;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : pre){
            adj.get(edge[0]).add(edge[1]);
        }
        for(int i =0; i<num; i++){
            for(int m : adj.get(i)){
                inD[m]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<num;i++){
            if(inD[i] == 0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.peek();
            q.poll();
            ans.add(node);
            for(int it : adj.get(node)){
                inD[it]--;
                if(inD[it] == 0){
                    q.add(it);
                }
            }
        }

        if(ans.size() == num){
            return true;
        }
        else{
            return false;
        }
    }
}