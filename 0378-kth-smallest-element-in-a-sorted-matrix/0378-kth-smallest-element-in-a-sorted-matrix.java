class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r = matrix.length;
        int c = matrix[0].length;
        int s = matrix[0][0];
        int e = matrix[r-1][c-1];
        while(s <= e){
            int assumeM = s + (e - s)/2;
            int les = findSmallest(matrix , assumeM);
             if(les <= k-1){
                s = assumeM +1;
            }
            else{
                e = assumeM -1;
            }
        }
        return s;
    }
    public int findSmallest(int matrix[][], int target){
        int count =0;
        for(int i =0; i<matrix.length; i++){
            int s =0;
            int e = matrix[i].length-1;
            while(s <= e){
                int mid = s + (e -s)/2;
                if(matrix[i][mid] <= target){
                    s = mid +1;
                }
                else{
                    e = mid -1;
                }
            }
            count +=s;
        }
        return count;
    }
}