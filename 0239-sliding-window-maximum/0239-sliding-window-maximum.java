class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int idx =0;
        int right =0;
        int n = nums.length;
        int[] ans = new int[n-k+1];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]-a[0]));
        while(right < n){
            pq.add(new int[]{nums[right],right});

            while(!pq.isEmpty() && pq.peek()[1] <= right-k){
                pq.poll();
            }
            if(!pq.isEmpty() && right >= k-1){
                ans[idx++] = pq.peek()[0];
            }
            right++;

        }
        return ans;
    }
}