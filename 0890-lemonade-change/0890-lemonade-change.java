class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        int twenty =0;
        int i =0;
        int n = bills.length;
        while(i < n){
            if(bills[i] == 5){
                five++;
            }
            else if(bills[i] == 10){
                if(five>=1){
                    five--;
                }
                else{
                    return false;
                }
                ten++;
            }
            else if(bills[i] == 20){
                if(ten>=1 && five>=1){
                    ten--;
                    five--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
                twenty++;
            }
            i++;
        }
        return true;
    }
}