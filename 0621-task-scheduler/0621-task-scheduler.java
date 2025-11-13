class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int[] freq = new int[26];
        for(char c : tasks){
            freq[c - 'A']++;
        }
        
        for(int a : freq){
            if(a > 0){
                pq.add(a);
            }
        }
        int total =0;
        while(!pq.isEmpty()){
            int cycle = n +1;
            List<Integer> temp = new ArrayList<>();

            while(cycle != 0 && !pq.isEmpty()){
                int cur = pq.poll();
                cur--;
                if(cur > 0){
                    temp.add(cur);
                }
                total++;
                cycle--;
            }
            for(int t : temp){
                pq.add(t);
            }
            if(!pq.isEmpty()){
                total += cycle;
            }
        }
        return total;
    }
}