class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
         int len = flowerbed.length;
        int k = n;
        if(n==0){
            return true;
        }
        if(len == 1 && flowerbed[0] == 0){
            return true;
        }
        if(len == 1 && flowerbed[0] == 1){
            return false;
        }
        if((flowerbed[0] == 0) && (flowerbed[1] == 0)){
                k--;
                flowerbed[0] = 1;
        }
        if((flowerbed[len-2] == 0) && (flowerbed[len-1] == 0)){
                flowerbed[len-1] = 1;
                k--;
            }
        for(int i =1; i<len-1; i++){
            
            if((flowerbed[i-1] == 0) && (flowerbed[i+1] == 0) && flowerbed[i] != 1){
                k--;
                flowerbed[i] = 1;
            }
            

        }
        
        if(k<= 0){
            return true;
        }
        else{
            return false;
        }
    }
}