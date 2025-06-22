class Solution {
    public int findMin(int[] arr) {
        int start = 0;
        int n = arr.length;
        int end = n -1;
        int minE = Integer.MAX_VALUE;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[start] <= arr[mid]){
                minE = Math.min(minE , arr[start]);
                start = mid + 1;
            }
            else{
                minE = Math.min(minE , arr[mid]);
                end = mid -1;
            }
        }
        return  minE;
    }
}