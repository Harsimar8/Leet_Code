class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        int mark =0;
        for(int i =arr.length -1; i>0; i--){
            if(arr[i-1] > arr[i]){
                arr[i-1]--;
                mark = i;
            }
        }
        if(mark == 0){
            return n;
        }
        for(int j =mark; j<arr.length; j++){
            arr[j] = '9';
        }
        return Integer.parseInt(new String(arr));
    }
}