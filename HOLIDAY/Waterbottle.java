class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;

        while (numBottles >= numExchange) {
            int newBottles = numBottles / numExchange;     
            int remainingEmpty = numBottles % numExchange;
            totalDrunk += newBottles;                     
            numBottles = newBottles + remainingEmpty;   
        }

        return totalDrunk;
    }
 
}