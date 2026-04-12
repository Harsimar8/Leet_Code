class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int one = nums1.length;
        int two = nums2.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int ok : nums1){
            pq.add(ok);
        }       
        for(int ko : nums2){
            pq.add(ko);
        }
        while(!pq.isEmpty()){
            int val = pq.poll();
            ans.add(val);
        }
        int sum = one + two;
        if(sum % 2 != 0){
            int mid = (one + two)/2;
            return (double)ans.get(mid);      
        }
        else{
            int mid = (one + two)/2;
            int mid1 = mid - 1;
            double last = (double)(ans.get(mid) + ans.get(mid1))/2;
            return last;
        }
    }
}