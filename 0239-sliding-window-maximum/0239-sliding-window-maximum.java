class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]-a[0]));
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int ind = 0;
        for(int i =0; i<n; i++){
            pq.offer(new int[]{nums[i], i});

            while(!pq.isEmpty() && pq.peek()[1] <= i - k){
                pq.poll();
            }
            if(!pq.isEmpty() && i >= k-1){
                ans[ind++] = pq.peek()[0];
            }
        }
        return ans;
    }
}