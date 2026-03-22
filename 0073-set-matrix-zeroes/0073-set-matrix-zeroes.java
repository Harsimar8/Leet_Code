class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRow = false;
        boolean firstCol = false;
        for(int i =0; i<n; i++){
            if(matrix[0][i] == 0){
                firstRow = true;
                break;
            }
        }

        for(int j =0; j<m; j++){
            if(matrix[j][0] == 0){
                firstCol = true;
                break;
            }
        }

        for(int k =1; k<m; k++){
            for(int l =1; l<n; l++){
                if(matrix[k][l] == 0){
                    matrix[k][0] = 0;
                    matrix[0][l] = 0;
                }
            }
        }

        for(int k =1; k<m; k++){
            for(int l =1; l<n; l++){
                if(matrix[k][0] == 0 || matrix[0][l] == 0){
                    matrix[k][l] = 0;
                }
            }
        }
        if(firstRow){
            for(int i = 0; i<n; i++){
                matrix[0][i] = 0;
            }
        }

        if(firstCol){
            for(int j = 0; j<m; j++){
                matrix[j][0] = 0;
            }
        }

    }
}