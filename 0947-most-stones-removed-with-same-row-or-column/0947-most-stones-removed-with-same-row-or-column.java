class DSU{
    
    Map<Integer,Integer> parent = new HashMap<>();
    int find(int x){
        parent.putIfAbsent(x,x);
        if(x != parent.get(x)){
            parent.put(x, find(parent.get(x)));
        }
        return parent.get(x);
    }
    void union(int x, int y){
        parent.put(find(x), find(y));
    }
}
class Solution {
    public int removeStones(int[][] stones) {
        DSU dsu = new DSU();
        for(int[] stone : stones){
            dsu.union(stone[0],stone[1] + 10001);
        }
        Set<Integer> comp = new HashSet<>();
        for(int[] st : stones){
            comp.add(dsu.find(st[0]));
        }
        return stones.length - comp.size();
    }
}