class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=  1;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<piles.length; i++){
            if(piles[i] > max){
                max= piles[i];
            }
        }
       
        
        
        int ans = -1;
        int end = max;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(isEatingSpeed(piles ,mid , h)){
                ans = mid;
                end = mid -1;
            }
            else{
                start = mid +1;
            }
        }
        return ans;
    }
    public static boolean isEatingSpeed(int arr[], int maxSpeed, int hrs){
        int totalHrs  =0;
        for(int i =0;i<arr.length; i++){
           totalHrs += arr[i]/maxSpeed;
           if(arr[i]%maxSpeed !=0){
            totalHrs += 1;
           }
           if(totalHrs > hrs){
            return false;
           }

        }
        return true;
    }
}