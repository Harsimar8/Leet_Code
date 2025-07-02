class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = n -1;
        int left =0;
         int right = m-1;
         while(left<= right && top <=bottom){
            for(int i =left;i<=right; i++ ){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j =top;j<=bottom; j++ ){
                result.add(matrix[j][right]);
            }
            right--;
            if(top <= bottom){
            for(int k =right;k>=left; k-- ){
                result.add(matrix[bottom][k]);
            }
            bottom--;
            }
            if(left <=right){
            for(int l =bottom;l>=top; l-- ){
                result.add(matrix[l][left]);
            }
            left++;
            }

         } 
         return result;
    }
}