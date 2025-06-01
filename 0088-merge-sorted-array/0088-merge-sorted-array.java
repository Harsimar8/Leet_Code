class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i =0;
        int j =0;
        int k =0;
        while(i < m){
            nums1[k++] = nums1[i++];
        }
        while( j < n){
            nums1[k++] = nums2[j++];
        }
        Arrays.sort(nums1);
    }
}