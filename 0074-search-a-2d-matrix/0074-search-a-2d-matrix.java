class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int s = 0;
        int e = m*n-1;
        while(s <= e){
            int mid = s + (e -s)/2;
            int r  =mid /n;
            int c =mid%n;
            int val = matrix[r][c];
            if(target == val){
                return true;
            }
            else if(target < val){
                e = mid -1;
            }
            else{
                s = mid +1;
            }
        }
        return false;
    }
}