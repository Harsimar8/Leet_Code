class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int r = matrix.length;
        int c = matrix[0].length;
        for(int i =0; i<r; i++){
            int minCol = 0;
            for(int j = 0; j<c; j++){
                if(matrix[i][j] < matrix[i][minCol]){
                    minCol = j;
                }
            }
            boolean flag = true;
            int ans = matrix[i][minCol];
            for(int k = 0; k<r; k++){
                    if(matrix[k][minCol] > ans){
                        flag = false;
                        break;
                    }
            }
            if(flag){
                result.add(matrix[i][minCol]);
            }
        }
        return result;
    }
}