class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res = binaryS(letters, target);
        return res;
    }
    public  static char binaryS(char[] arr, char target){
        int start =0;
        int n = arr.length;
        int end = n-1;
        char ans = '$';
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid]<=target){
                start = mid+1;
            }
            else{
                end = mid -1;
                ans = arr[mid];
            }
        }
        return (ans == '$' ? arr[0] : ans);
    }
}