class Solution {
    public long smallestNumber(long num) {
        ArrayList<Long> ans = new ArrayList<>();
        int cnt =0;
        if(num == 0){
            return 0;
        }
        boolean isNegative = num < 0;
        long nm = Math.abs(num);
        while(nm != 0){
            long last = nm%10;
            ans.add(last);
            cnt++;
            nm/=10;
        }
        long[] arr = new long[ans.size()];
        for(int i =0; i<ans.size(); i++){
            arr[i] = ans.get(i);
        }
        Arrays.sort(arr);
        long re = 0;
        int left = 0;
        if(!isNegative){
        while(arr[0] == 0){
            if(arr[left] != 0){
                long swap = arr[0];
                arr[0] = arr[left];
                arr[left] = swap;
                break;
            }
            left++;
        }
        for(long c  : arr){
            re = re * 10 + c;
        }
        }
        else{
        int base = 1;
        for(int j =arr.length-1; j>=0; j--){
            re  = re * 10 + arr[j]; 
            
        }
        re = -re;
        }
        return re;
    }
}