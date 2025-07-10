class Solution {
    public String reverseWords(String s) {
        String ch[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        
        for(int i =0; i<ch.length;i++){
            char ans[] = ch[i].toCharArray();
            reverse(ans);
            res.append(ans);
            if(i <  ch.length-1){
                res.append(" ");
            }
            
        }
        return res.toString();

    }
    public void reverse(char arr[]){
        int left =0;
        int right =arr.length -1;
        while(left<= right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}