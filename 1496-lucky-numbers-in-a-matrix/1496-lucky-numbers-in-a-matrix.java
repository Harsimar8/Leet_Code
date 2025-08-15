class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int r = matrix.length;
        int c = matrix[0].length;
        int[] arr1 = new int[r+1];
        int[] arr2 = new int[c+1];
        
        for(int i =0; i<r; i++){
            int minR = i;
            int minC = 0;
            for(int j =0; j<c; j++){
                if(matrix[i][j] < matrix[minR][minC]){
                    minR = i;
                    minC = j;
                }
            }
            arr1[i] = matrix[minR][minC];
        }
        for(int i =0; i<c; i++){
            int maxR =0;
            int maxC =i;
            for(int j =0; j<r; j++){
                if(matrix[j][i] > matrix[maxR][maxC]){
                    maxR = j;
                    maxC = i;
                }
            }
            arr2[i] = matrix[maxR][maxC];
        }
        for(int i =0; i<r;i++){
            for(int j =0; j<c; j++){
                if(arr1[i] == arr2[j]){
                    ans.add(arr1[i]);
                }
            }
        }
        return ans;
    }
}