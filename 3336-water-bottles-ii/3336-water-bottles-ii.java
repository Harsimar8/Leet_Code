class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totald = numBottles;
        int totalEmp = numBottles;

        int ex = numExchange;

        while (totalEmp >= ex) {
            
            totalEmp -= ex; 
            totald += 1;  
            totalEmp += 1;       
            ex += 1;     
        }

        return totald;
    }
}
