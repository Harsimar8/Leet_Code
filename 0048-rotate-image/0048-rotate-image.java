class Solution {
    public void rotate(int[][] matrix) {
        int a = matrix.length;
        int b = matrix[0].length;
        int[][] ans = new int[a][b];
        for(int i =0; i<a;i++){
            for(int j =0; j<b;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        for(int i =0; i<a; i++){
            swap(ans[i]);
        }
        for(int i =0; i<a; i++){
            for(int j =0; j<b; j++){
                matrix[i][j] = ans[i][j];
            }
        }

    }
    public void swap(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}