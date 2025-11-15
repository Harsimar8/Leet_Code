class Solution {
    public int[][] rangeAddQueries(int n, int[][] q) {
        int[][] arr = new int[n][n];
        for(int[] a : arr){
            Arrays.fill(a,0);
        }
        for(int[] b : q){
            int zero = b[0];
            int one = b[1];
            int two = b[2];
            int three = b[3];
                        for(int r = zero; r <= two; r++){
                            for(int s = one; s <= three; s++){
                                arr[r][s] +=1;
                            }
                        }
            
        }
        return arr;
        
    }
}