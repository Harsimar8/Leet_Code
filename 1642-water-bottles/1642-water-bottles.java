class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles; // Start by drinking all initial bottles
        int emptyBottles = numBottles; // Track empty bottles

        while (emptyBottles >= numExchange) {
            int newFull = emptyBottles / numExchange; // Exchange empty bottles for new full ones
            totalDrunk += newFull;                   // Drink the new full bottles
            emptyBottles = emptyBottles % numExchange + newFull; // Update empty bottles
        }

        return totalDrunk;
    }
}
