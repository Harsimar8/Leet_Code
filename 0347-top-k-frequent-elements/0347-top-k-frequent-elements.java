class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int a : nums){
            mpp.put(a, mpp.getOrDefault(a,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((n1,n2) -> (mpp.get(n1) - mpp.get(n2)));
        for(int ab : mpp.keySet()){
            pq.add(ab);
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] ans = new int[pq.size()];
        for(int i =0; i<k; i++){
            ans[i] = pq.poll();
        }
        return ans;


    }
}