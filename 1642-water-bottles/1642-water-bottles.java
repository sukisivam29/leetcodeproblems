class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int consumed = 0;
        while(numBottles>=numExchange){
            int k = numBottles/numExchange;
            consumed += numExchange*k;
            numBottles -= numExchange * k;
            numBottles+=k;
        }
        return consumed+numBottles;
    }
}